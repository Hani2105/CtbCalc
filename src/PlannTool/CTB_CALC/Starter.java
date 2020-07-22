/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlannTool.CTB_CALC;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gabor_hanacsek
 */
public class Starter {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, UnsupportedLookAndFeelException, InterruptedException, InstantiationException, IllegalAccessException, ParseException {

        CTB c = new CTB();
        c.setVisible(true);

    }

}
