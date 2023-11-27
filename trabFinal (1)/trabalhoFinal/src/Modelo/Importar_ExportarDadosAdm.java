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

        Sheet sheet = workbook.getSheetAt(0);

        // Verifica se há pelo menos uma linha de dados
        if (sheet.getLastRowNum() >= 0) {
            Row row = sheet.getRow(0); // Acessa a primeira linha

            // Verifica se as células não são nulas antes de acessar
            if (row != null && row.getCell(0) != null && row.getCell(1) != null && row.getCell(2) != null
                    && row.getCell(3) != null && row.getCell(4) != null && row.getCell(5) != null) {

                // Verifica e trata os tipos de dados corretamente
                Cell cellNome = row.getCell(0);
                Cell cellEmail = row.getCell(1);
                Cell cellCpf = row.getCell(2);
                Cell cellId = row.getCell(3);
                Cell cellDataNascimento = row.getCell(4);
                Cell cellSenha = row.getCell(5);

                if (cellNome.getCellType() == CellType.STRING) {
                    adm.setNome(cellNome.getStringCellValue());
                } else {
                    logger.error("Tipo de dado inválido para o nome.");
                }

                if (cellEmail.getCellType() == CellType.STRING) {
                    adm.setEmail(cellEmail.getStringCellValue());
                } else {
                    logger.error("Tipo de dado inválido para o e-mail.");
                }

                if (cellCpf.getCellType() == CellType.STRING) {
                    adm.setCpf(cellCpf.getStringCellValue());
                } else {
                    logger.error("Tipo de dado inválido para o CPF.");
                }

                if (cellId.getCellType() == CellType.NUMERIC) {
                    adm.setId((int) cellId.getNumericCellValue());
                } else {
                    logger.error("Tipo de dado inválido para o ID.");
                }

                if (cellDataNascimento.getCellType() == CellType.STRING) {
                    adm.setDataNascimento(cellDataNascimento.getStringCellValue());
                } else {
                    logger.error("Tipo de dado inválido para a data de nascimento.");
                }

                if (cellSenha.getCellType() == CellType.STRING) {
                    adm.setSenha(cellSenha.getStringCellValue());
                } else {
                    logger.error("Tipo de dado inválido para a senha.");
                }

            } else {
                logger.error("Células nulas encontradas na linha de dados.");
            }
        } else {
            logger.error("Não há linhas de dados no arquivo.");
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


    public static void exportData(String caminhoArquivoExcel, Administrador adm) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet();

            // Preenche com os novos dados
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue(adm.getNome());
            row.createCell(1).setCellValue(adm.getEmail());
            row.createCell(2).setCellValue(adm.getCpf());
            row.createCell(3).setCellValue(adm.getId());
            row.createCell(4).setCellValue(adm.getDataNascimento());
            row.createCell(5).setCellValue(adm.getSenha());

            // Utiliza o mesmo caminho do arquivo original para sobrescrever
            try (FileOutputStream fileOut = new FileOutputStream(caminhoArquivoExcel)) {
                workbook.write(fileOut);
            }
        }
    }
}
