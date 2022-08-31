package sistema.model;

import java.text.SimpleDateFormat;

import javax.swing.table.AbstractTableModel;

import sistema.controller.listagemClienteController;

public class tabelaClienteModel extends AbstractTableModel {

    private listagemClienteController controller;

    public tabelaClienteModel(listagemClienteController controller) {
        this.controller = controller;
    }

    @Override
    public int getRowCount() {
        return controller.getAllClientes().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var umCliente = controller.getAllClientes().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return umCliente.getId();
            case 1:
                return umCliente.getNome();
            case 2:
                return umCliente.getCpf();
            case 3:
                return sdf.format(umCliente.getNascimento());
            default:
                return "";
        }

    }

    @Override
    public String getColumnName(int column) {
        return new String[]{"ID", "Nome", "CPF", "Data nascimento"}[column];
    }
    

}
