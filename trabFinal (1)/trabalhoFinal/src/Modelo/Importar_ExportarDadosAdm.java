package Modelo;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trabalhofinal.Administrador;

public class Importar_ExportarDadosAdm {
    private static final Logger logger = LogManager.getLogger(Importar_ExportarDadosAdm.class);

    public static Administrador importData(String caminhoArquivoExcel) {
        Administrador adm = new Administrador();
        Workbook workbook = null;

        try {
            System.out.println("Tentando abrir o arquivo: " + caminhoArquivoExcel);
            workbook = WorkbookFactory.create(new File(caminhoArquivoExcel));
            System.out.println("Arquivo aberto com sucesso.");

            // Acessa a primeira planilha (aba)
            Sheet sheet = workbook.getSheetAt(0);

            // Verifica se há pelo menos uma linha de dados
            if (sheet.getLastRowNum() >= 1) {
                Row row = sheet.getRow(1); // Acessa a segunda linha

                // Verifica se as células não são nulas antes de acessar
                if (row != null && row.getCell(0) != null && row.getCell(1) != null && row.getCell(2) != null
                        && row.getCell(3) != null && row.getCell(4) != null && row.getCell(5) != null) {

                    adm.setNome(row.getCell(0).getStringCellValue());
                    adm.setEmail(row.getCell(1).getStringCellValue());
                    adm.setCpf(row.getCell(2).getStringCellValue());
                    adm.setId((int) row.getCell(3).getNumericCellValue());
                    adm.setDataNascimento(row.getCell(4).getStringCellValue());
                    adm.setSenha(row.getCell(5).getStringCellValue());
                } else {
                    logger.error("Células nulas encontradas na linha de dados.");
                }
            } else {
                logger.error("Não há linhas de dados suficientes no arquivo.");
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

        return adm;
    }




    public static void exportDataAdm(String caminhoArquivoExcel, Administrador adm) throws IOException {
        // Altere o nome do arquivo de saída para algo diferente
        String caminhoArquivoSaida = caminhoArquivoExcel.replace(".xlsx", "_saida.xlsx");

        try (Workbook workbook = WorkbookFactory.create(new File(caminhoArquivoExcel))) {
        Sheet sheet = workbook.getSheetAt(0);

            // Preenche com os novos dados
            Row row = sheet.createRow(1);
            row.createCell(0).setCellValue(adm.getNome());
            row.createCell(1).setCellValue(adm.getEmail());
            row.createCell(2).setCellValue(adm.getCpf());
            row.createCell(3).setCellValue(adm.getId());
            row.createCell(4).setCellValue(adm.getDataNascimento());
            row.createCell(5).setCellValue(adm.getSenha());

            try (FileOutputStream fileOut = new FileOutputStream(caminhoArquivoSaida)) {
                workbook.write(fileOut);
            }
        }
    }


}
