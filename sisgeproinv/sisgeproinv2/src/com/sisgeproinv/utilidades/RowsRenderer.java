package com.sisgeproinv.utilidades;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class RowsRenderer extends DefaultTableCellRenderer
{

@Override
public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocused, int row, int column)
{        
    super.getTableCellRendererComponent(table, value, isSelected, hasFocused, row, column);
    if(table.getValueAt(row,1).equals("DISPONIBLE"))
    {
        setForeground(Color.BLUE);
        if(isSelected){setBackground(Color.WHITE);}
    }else if(table.getValueAt(row,1).equals("RESERVADO")){
        setForeground(Color.RED);
        if(isSelected){setBackground(Color.WHITE);}
    }
    return this;
  }
  }
