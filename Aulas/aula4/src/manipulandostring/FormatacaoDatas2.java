/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandostring;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author heloh
 */

/*Desenvolva um programa, use o número de classes e métodos
que achar necessário, para testar a formatação de datas usando a
nova API de datas do Java 8. Acesse o link abaixo para conhecer a API
http://blog.caelum.com.br/conheca-a-nova-api-de-datas-do-java-8/*/

public class FormatacaoDatas2 {
    public static void main(String[] args) 
    {
        Instant agora = Instant.now();
        System.out.println(agora); 
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); 
        
        ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/New_York");
        ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
        System.out.println(agoraEmSaoPaulo); 
    }
}
