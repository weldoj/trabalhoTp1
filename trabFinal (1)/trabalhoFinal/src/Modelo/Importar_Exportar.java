package Modelo;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trabalhofinal.Funcionarios;

public class Importar_Exportar {
    private static final Logger logger = LogManager.getLogger(Importar_Exportar.class);

    public static ArrayList<Funcionarios> importData(String caminhoArquivoExcel) {
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();
        Workbook workbook = null;

        try {
            System.out.println("Tentando abrir o arquivo: " + caminhoArquivoExcel);
            workbook = WorkbookFactory.create(new File(caminhoArquivoExcel));
            System.out.println("Arquivo aberto com sucesso.");

            Sheet sheet = workbook.getSheetAt(1);

            Iterator<Row> rowIterator = sheet.iterator();

            

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Funcionarios funcionario = new Funcionarios();

                funcionario.setId(row.getCell(0).getStringCellValue());
                funcionario.setNome(row.getCell(1).getStringCellValue());
                funcionario.setCpf(row.getCell(2).getStringCellValue());
                funcionario.setCargo(row.getCell(3).getStringCellValue());
                funcionario.setSalario((float) row.getCell(4).getNumericCellValue());
                listaFuncionarios.add(funcionario);
            }
        } catch (FileNotFoundException e) {
            logger.error("Arquivo não encontrado: " + caminhoArquivoExcel);
        } catch (IOException e) {
            logger.error("Erro ao importar dados. Exceção: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
                logger.error("Erro ao fechar o workbook: " + e.getMessage());
            }
        }

        return listaFuncionarios;
    }

    public static void exportData(String caminhoArquivoExcel, ArrayList<Funcionarios> funcionarios) {
    // Altere o nome do arquivo de saída para algo diferente
    String caminhoArquivoSaida = caminhoArquivoExcel.replace(".xlsx", "_saida.xlsx");

    try (Workbook workbook = WorkbookFactory.create(new File(caminhoArquivoExcel))) {
        Sheet sheet = workbook.getSheetAt(1);

        // Limpa todas as linhas, mantendo o cabeçalho
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            Row currentRow = sheet.getRow(i);
            if (currentRow != null) {
                sheet.removeRow(currentRow);
            }
        }

        // Preenche com os novos dados
        int rowNum = 0; // Comece do índice 0 (cabeçalho)
        for (Funcionarios funcionario : funcionarios) {
            Row row = sheet.createRow(++rowNum);

            try {
                
                row.createCell(0).setCellValue(funcionario.getId());
                row.createCell(1).setCellValue(funcionario.getNome());
                row.createCell(2).setCellValue(funcionario.getCpf());
                row.createCell(3).setCellValue(funcionario.getCargo());
                row.createCell(4).setCellValue(funcionario.getSalario());
            } catch (Exception e) {
                logger.error("Erro ao processar dados para linha: " + rowNum + ". Motivo: " + e.getMessage());
            }
        }

        try (FileOutputStream fileOut = new FileOutputStream(caminhoArquivoSaida)) {
            workbook.write(fileOut);
        }
    } catch (IOException e) {
        logger.error("Erro ao exportar dados. Exceção: " + e.getMessage());
    }
}


}
