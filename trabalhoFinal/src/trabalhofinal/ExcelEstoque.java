/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

/**
 *
 * @author Gabriel
 */

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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ExcelEstoque {
    
  

    private static final String EXCEL_FILE_PATH = "/home/Gabriel/NetBeansProjects/trabalhoTp1/trabalhoFinal/arquivo2.xlsx";
    
    //private Map<String, List<Estoque>> mapaProdutosPorTipo;

  

    //public ExcelEstoque() {
   //     this.mapaProdutosPorTipo = new HashMap<>();
    //}

   public Map<String, List<Estoque>> lerDadosDoArquivo() {
        Map<String, List<Estoque>> mapaProdutosPorTipo = new HashMap<>();
        Workbook workbook = null;

        try {
            workbook = new XSSFWorkbook(new FileInputStream(EXCEL_FILE_PATH));

            // Iterar sobre as planilhas a partir da segunda
            for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
                Sheet sheet = workbook.getSheetAt(sheetIndex);
                String tipoAlimento = sheet.getSheetName();

                Iterator<Row> rowIterator = sheet.iterator();
                List<Estoque> produtosDoTipo = new ArrayList<>();

                // Ignorar cabeçalho (se houver)
                if (rowIterator.hasNext()) {
                    rowIterator.next();
                }

                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Iterator<Cell> cellIterator = row.cellIterator();

                    int codigo = (int) cellIterator.next().getNumericCellValue();
                    String nome = cellIterator.next().getStringCellValue();
                    int quantidade = (int) cellIterator.next().getNumericCellValue();
                    String unidade = cellIterator.next().getStringCellValue();
                    String validade = cellIterator.next().getStringCellValue();
                    double custo = cellIterator.next().getNumericCellValue();

                    Estoque produto = new Estoque(codigo, nome, quantidade, unidade, validade, custo);
                    produtosDoTipo.add(produto);
                }

                // Adicionar a lista de produtos do tipo ao mapa
                mapaProdutosPorTipo.put(tipoAlimento, produtosDoTipo);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Lide com a exceção conforme necessário
        } finally {
            if (workbook != null) {
                
            }
}
        return mapaProdutosPorTipo;
    }

    
  

        public void salvarDadosNoArquivo(Map<String, List<Estoque>> mapaProdutosPorTipo) {
            Workbook workbook = null;

            try {
                File file = new File(EXCEL_FILE_PATH);
                workbook = new XSSFWorkbook();


                for (Map.Entry<String, List<Estoque>> entry : mapaProdutosPorTipo.entrySet()) {
                    String tipoAlimento = entry.getKey();

                    List<Estoque> produtosDoTipo = entry.getValue();

                    // Cria uma nova planilha para cada tipo de alimento
                    Sheet sheet = workbook.createSheet(tipoAlimento);

                    // Cria o cabeçalho
                    Row headerRow = sheet.createRow(0);
                    headerRow.createCell(0).setCellValue("Código");
                    headerRow.createCell(1).setCellValue("Nome");
                    headerRow.createCell(2).setCellValue("Quantidade");
                    headerRow.createCell(3).setCellValue("Unidade");
                    headerRow.createCell(4).setCellValue("Validade");
                    headerRow.createCell(5).setCellValue("Custo");

                    // Preenche os dados da lista na planilha
                    int rowNum = 1;
                    for (Estoque produto : produtosDoTipo) {
                        Row row = sheet.createRow(rowNum++);
                        row.createCell(0).setCellValue(produto.getCodigo());
                        row.createCell(1).setCellValue(produto.getNomeProduto());
                        row.createCell(2).setCellValue(produto.getQuantidade());
                        row.createCell(3).setCellValue(produto.getUnidade());
                        row.createCell(4).setCellValue(produto.getValidade());
                        row.createCell(5).setCellValue(produto.getCusto());
                    }
                }


                // Salva o workbook no arquivo
                try (FileOutputStream outputStream = new FileOutputStream(file)) {
                    workbook.write(outputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Lide com a exceção conforme necessário
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

    public void editarProduto(Map<String, List<Estoque>> mapaProdutosPorTipo, String tipoAlimento, int index, Estoque produtoEditado) {
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);
        produtosDoTipo.set(index, produtoEditado);
        salvarDadosNoArquivo(mapaProdutosPorTipo);
    }

    public void excluirProduto(Map<String, List<Estoque>> mapaProdutosPorTipo, String tipoAlimento, int index) {
        List<Estoque> produtosDoTipo = mapaProdutosPorTipo.get(tipoAlimento);
        produtosDoTipo.remove(index);
        salvarDadosNoArquivo(mapaProdutosPorTipo);
    }

}


