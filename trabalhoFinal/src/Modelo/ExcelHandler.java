package Modelo;

import java.io.Closeable;
import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import trabalhofinal.Restaurante;


public class ExcelHandler {
String diretorioAtual = System.getProperty("user.dir");

String EXCEL_FILE_PATH = diretorioAtual + File.separator + "arquivo.xlsx";

    public List<Restaurante> lerDadosDoArquivo() {
        List<Restaurante> restaurantes = new ArrayList<>();
        Workbook workbook = null;

        try {
            workbook = new XSSFWorkbook(new FileInputStream(EXCEL_FILE_PATH));
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                String nome = cellIterator.next().getStringCellValue();
                long cnpj = (long) cellIterator.next().getNumericCellValue();
                String endereco = cellIterator.next().getStringCellValue();
                String descricao = cellIterator.next().getStringCellValue();
                long telefone = (long) cellIterator.next().getNumericCellValue();

                restaurantes.add(new Restaurante(nome, cnpj, endereco, descricao, telefone));
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo Excel", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (workbook instanceof Closeable) {
                try {
                    ((Closeable) workbook).close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return restaurantes;
    }

   public void salvarDadosNoArquivo(List<Restaurante> restaurantes) {
    Workbook workbook = null;

    try {
        File file = new File(EXCEL_FILE_PATH);

        if (file.exists()) {
            // Se o arquivo existir, carregue o workbook a partir do arquivo
            try (InputStream inp = new FileInputStream(file)) {
                workbook = WorkbookFactory.create(inp);

                // Atualizar os dados existentes no arquivo
                Sheet sheet = workbook.getSheetAt(0);
                for (int i = 0; i < restaurantes.size(); i++) {
                    Restaurante restaurante = restaurantes.get(i);
                    Row row = findRowByCnpj(sheet, restaurante.getCnpj());

                    if (row != null) {
                        // Atualizar os valores nas células existentes
                        int colNum = 0;
                        row.getCell(colNum++).setCellValue(restaurante.getNomeEmp());
                        row.getCell(colNum++).setCellValue(restaurante.getCnpj());
                        row.getCell(colNum++).setCellValue(restaurante.getEndereco());
                        row.getCell(colNum++).setCellValue(restaurante.getDescricao());
                        row.getCell(colNum).setCellValue(restaurante.getTelefone());
                    } else {
                        // Se não encontrar a linha, criar uma nova
                        row = sheet.createRow(sheet.getLastRowNum() + 1);

                        int colNum = 0;
                        row.createCell(colNum++).setCellValue(restaurante.getNomeEmp());
                        row.createCell(colNum++).setCellValue(restaurante.getCnpj());
                        row.createCell(colNum++).setCellValue(restaurante.getEndereco());
                        row.createCell(colNum++).setCellValue(restaurante.getDescricao());
                        row.createCell(colNum).setCellValue(restaurante.getTelefone());
                    }
                }
            }
        } else {
            // Se o arquivo não existir, crie um novo workbook
            workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet();

            // Criar cabeçalho
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Nome");
            headerRow.createCell(1).setCellValue("CNPJ");
            headerRow.createCell(2).setCellValue("Endereço");
            headerRow.createCell(3).setCellValue("Descrição");
            headerRow.createCell(4).setCellValue("Telefone");

            // Preencher com os dados dos restaurantes
            int rowNum = 1;
            for (Restaurante restaurante : restaurantes) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                row.createCell(colNum++).setCellValue(restaurante.getNomeEmp());
                row.createCell(colNum++).setCellValue(restaurante.getCnpj());
                row.createCell(colNum++).setCellValue(restaurante.getEndereco());
                row.createCell(colNum++).setCellValue(restaurante.getDescricao());
                row.createCell(colNum).setCellValue(restaurante.getTelefone());
            }
        }

        // Salvar o workbook de volta no arquivo
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            workbook.write(outputStream);
        }
    } catch (IOException | EncryptedDocumentException  e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo Excel", "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        
    }
}

public void excluirDadosDoArquivo(List<Restaurante> restaurantes, long cnpjParaExcluir) {
    Workbook workbook = null;

    try {
        File file = new File(EXCEL_FILE_PATH);

        if (file.exists()) {
            // Se o arquivo existir, carregue o workbook a partir do arquivo
            try (InputStream inp = new FileInputStream(file)) {
                workbook = WorkbookFactory.create(inp);

                // Obtenha a planilha
                Sheet sheet = workbook.getSheetAt(0);

                // Encontre a linha com base no CNPJ
                Row rowToRemove = findRowByCnpj(sheet, cnpjParaExcluir);

                if (rowToRemove != null) {
                    // Remova a linha
                    sheet.removeRow(rowToRemove);
                }
            }

            // Salvar o workbook de volta no arquivo
            try (FileOutputStream outputStream = new FileOutputStream(file)) {
                workbook.write(outputStream);
            }
        }
    } catch (IOException | EncryptedDocumentException  e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao excluir dados no arquivo Excel", "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (workbook instanceof Closeable) {
            try {
                ((Closeable) workbook).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

private Row findRowByCnpj(Sheet sheet, long cnpj) {
    for (int i = 0; i <= sheet.getLastRowNum(); i++) { // Começar da segunda linha (ignorar cabeçalho)
        Row row = sheet.getRow(i);
        if (row != null) {
            Cell cnpjCell = row.getCell(1); // Índice 1 é a coluna do CNPJ
            if (cnpjCell != null && (long) cnpjCell.getNumericCellValue() == cnpj) {
                return row;
            }
        }
    }
    return null; // Se não encontrar, retorna null
}



}


