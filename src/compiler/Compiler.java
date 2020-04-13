/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.File;

/**
 *
 * @author kennychavez
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "/Users/kennychavez/NetBeansProjects/Compiler/src/compiler/Lexer.flex";
        generateLexer(path);
    }
    
    public static void generateLexer(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
}
