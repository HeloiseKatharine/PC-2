/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*- Desenvolva um programa, use o número de classes e métodos
que achar necessário, para testar a formatação de datas usando a
classe SimpleDateFormat.*/

package manipulandostring;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author heloh
 */
public class FormatacaoDatas {
    public static void main(String[] args) 
    {
        Date dataHoje = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");//use MM e não mm
        System.out.println(sf.format(dataHoje));
    }
}