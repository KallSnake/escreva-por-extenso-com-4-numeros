package porextenso;

import java.util.*;

public class PorExtenso {

    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Informe 4 números: ");
        
        String num = in.next();
        
        String nomePorExtenso = "";
        
        
        // Limitando pouco mais o usuário
        if ( (num.length() < 4) || (num.length() > 4) ) {
            
            System.out.println("Erro no processamento. Tente novamente!");
            
        } else {
            
            
            String m = (num.substring(0, 1));
            String c = (num.substring(1, 2));
            String d = (num.substring(2, 3));
            String u = (num.substring(3, 4));

            String dez = (num.substring(2, 4));

            // System.out.println("Duas ultimas casas: " + dez);
            
            
            /*
            System.out.println("Milhar: " + m);
            System.out.println("Centena: " + c);
            System.out.println("Dezena: " + d);
            System.out.println("Unidade: " + u);
            */
  

            // Nome por Extenso na casa de MILHAR
            switch (m) {

                case "1": nomePorExtenso += "Mil";
                          break;

                case "2": nomePorExtenso += "Dois mil";
                          break;

                case "3": nomePorExtenso += "Três mil";
                          break;

                case "4": nomePorExtenso += "Quatro mil";
                          break;

                case "5": nomePorExtenso += "Cinco mil";
                          break;

                case "6": nomePorExtenso += "Seis mil";
                          break;

                case "7": nomePorExtenso += "Sete mil";
                          break;

                case "8": nomePorExtenso += "Oito mil";
                          break;

                case "9": nomePorExtenso += "Nove mil";
                          break;

                case "0": nomePorExtenso += "m";
                          break;
                default:
                    break;

            }


            // System.out.println("Voçê informou: " + nomePorExtenso);


            
            // Nome por Extenso na casa da CENTENA
            switch (c) {

                case "1": nomePorExtenso += " e Cem";
                          break;

                case "2": nomePorExtenso += " e Duzentos";
                          break;

                case "3": nomePorExtenso += " e Trezentos";
                          break;

                case "4": nomePorExtenso += " e Quatrocentos";
                          break;

                case "5": nomePorExtenso += " e Quinhentos";
                          break;

                case "6": nomePorExtenso += " e Seiscentos";
                          break;

                case "7": nomePorExtenso += " e Setecentos";
                          break;

                case "8": nomePorExtenso += " e Oitocentos";
                          break;

                case "9": nomePorExtenso += " e Novecentos";
                          break;

                case "0": nomePorExtenso += "";
                          break;
                default:
                    break;

            }


            // System.out.println("Voçê informou: " + nomePorExtenso);



            // Nome por Extenso na casa da DEZENA
            switch (d) {

                case "2": nomePorExtenso += " e Vinte";
                          break;

                case "3": nomePorExtenso += " e Trinta";
                          break;

                case "4": nomePorExtenso += " e Quarenta";
                          break;

                case "5": nomePorExtenso += " e Ciquenta";
                          break;

                case "6": nomePorExtenso += " e Sessenta";
                          break;

                case "7": nomePorExtenso += " e Setenta";
                          break;

                case "8": nomePorExtenso += " e Oitenta";
                          break;

                case "9": nomePorExtenso += " e Noventa";
                          break;

                case "0": nomePorExtenso += "";
                          break;
                default:
                    break;

            }


            // System.out.println("Voçê informou: " + nomePorExtenso);




            // Nome por Extenso nas 2 (duas) ultimas casas (10 até 19)
            switch (dez) {


                case "10": nomePorExtenso += " e Dez";
                          break;

                case "11": nomePorExtenso += " e Onze";
                          break;

                case "12": nomePorExtenso += " e Doze";
                          break;

                case "13": nomePorExtenso += " e Treze";
                          break;

                case "14": nomePorExtenso += " e Quatorze";
                          break;

                case "15": nomePorExtenso += " e Quinze";
                          break;

                case "16": nomePorExtenso += " e Dezesseis";
                          break;

                case "17": nomePorExtenso += " e Dezessete";
                          break;

                case "18": nomePorExtenso += " e Dezoito";
                          break;

                case "19": nomePorExtenso += " e Dezenove";
                          break;

                case "00": nomePorExtenso += "";
                          break;

                default:
                    break;

            }


            // System.out.println("Voçê informou: " + nomePorExtenso);


            

            // Nome por Extenso na casa da UNIDADE
            if ( (dez != "10") && (dez != "11") && (dez != "12") && (dez != "13") && (dez != "14") && (dez != "15") && (dez != "16") && (dez != "17") && (dez != "18") && (dez != "19") && (d == "1" || d.equals("2") || d.equals("3") || d.equals("4") || d.equals("5") || d.equals("6") || d.equals("7") || d.equals("8") || d.equals("9")) ) {

                switch (u) {

                    case "1": nomePorExtenso += " e Um";
                              break;

                    case "2": nomePorExtenso += " e Dois";
                              break;

                    case "3": nomePorExtenso += " e Três";
                              break;

                    case "4": nomePorExtenso += " e Quatro";
                              break;

                    case "5": nomePorExtenso += " e Cinco";
                              break;

                    case "6": nomePorExtenso += " e Seis";
                              break;

                    case "7": nomePorExtenso += " e Sete";
                              break;

                    case "8": nomePorExtenso += " e Oito";
                              break;

                    case "9": nomePorExtenso += " e Nove";
                              break;

                    default:
                        break;

                }

            }



            String replaceNomePorExtenso = "";





            if ( m.equals("0") && c.equals("0") && d.equals("0") && u.equals("0") ) {

                System.out.println("Voçê informou 4 (quatro) sequência de 0 (zero). Favor tente novamente!");

            } else if ( m.equals("0") ) {

                String verificarM = nomePorExtenso.substring(0,3);

                // System.out.println("...: " + verificarM);

                replaceNomePorExtenso = nomePorExtenso.replace(verificarM, "");

                if ( replaceNomePorExtenso != "" && c != "1" ) {

                    System.out.println("Voçê informou: " + replaceNomePorExtenso.replace("Cem", "Cento"));

                }

            } else if ( c != "1" ) {

                   System.out.println("Voçê informou: " + nomePorExtenso.replace("Cem", "Cento"));

            } else {

                 System.out.println("Voçê informou: " + nomePorExtenso);

            }
            
            
            
        } // Fim Algoritmo
        
        
        
        
        
            
    }
    
}
