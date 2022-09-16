import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prim = sc.nextLine();


        StringTokenizer token = new StringTokenizer(prim);

        ArrayList<String> tokens = new ArrayList<>();
        while (token.hasMoreTokens()) {
            //System.out.println(token.nextToken());
            tokens.add(token.nextToken()); // теперь входные данные приходят в виде листа в переменной tokens
        }
        //System.out.println(tokens);
        //System.out.println(tokens.get(0));

        String st1 = tokens.get(0);
        String st2 = tokens.get(1);
        String st3 = tokens.get(2);
        char Operation = st2.charAt(0);


        boolean Roman = false;

        if (tokens.contains("I") || tokens.contains("II") || tokens.contains("III") || tokens.contains("IV") || tokens.contains("V") || tokens.contains("VI") || tokens.contains("VII") || tokens.contains("VIII") || tokens.contains("IX") || tokens.contains("X")) {
            Roman = true;
        }

            //System.out.println(Roman);
            int RIMA;
            int RIMB;
            int resultR;
            if (Roman) {
                switch (tokens.get(0)) {
                    case "I":
                        RIMA = 1;
                        break;
                    case "II":
                        RIMA = 2;
                        break;
                    case "III":
                        RIMA = 3;
                        break;
                    case "IV":
                        RIMA = 4;
                        break;
                    case "V":
                        RIMA = 5;
                        break;
                    case "VI":
                        RIMA = 6;
                        break;
                    case "VII":
                        RIMA = 7;
                        break;
                    case "VIII":
                        RIMA = 8;
                        break;
                    case "IX":
                        RIMA = 9;
                        break;
                    case "X":
                        RIMA = 10;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + tokens.get(0));
                }

                switch (tokens.get(2)) {
                    case "I":
                        RIMB = 1;
                        break;
                    case "II":
                        RIMB = 2;
                        break;
                    case "III":
                        RIMB = 3;
                        break;
                    case "IV":
                        RIMB = 4;
                        break;
                    case "V":
                        RIMB = 5;
                        break;
                    case "VI":
                        RIMB = 6;
                        break;
                    case "VII":
                        RIMB = 7;
                        break;
                    case "VIII":
                        RIMB = 8;
                        break;
                    case "IX":
                        RIMB = 9;
                        break;
                    case "X":
                        RIMB = 10;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + tokens.get(2));


                }

                switch (Operation) { // Считаеам Римские
                    case '+':
                        resultR = RIMA + RIMB;
                        break;
                    case '-':
                        resultR = RIMA - RIMB;
                        break;
                    case '/':
                        resultR = RIMA / RIMB;
                        break;
                    case '*':
                        resultR = RIMA * RIMB;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + tokens.get(1));
                }

                switch (resultR){
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                    case 11:
                        System.out.println("XI");
                        break;
                    case 12:
                        System.out.println("XII");
                        break;
                    case 13:
                        System.out.println("XIII");
                        break;
                    case 14:
                        System.out.println("XIV");
                        break;
                    case 15:
                        System.out.println("XV");
                        break;
                    case 16:
                        System.out.println("XVI");
                        break;
                    case 17:
                        System.out.println("XVII");
                        break;
                    case 18:
                        System.out.println("XVIII");
                        break;
                    case 19:
                        System.out.println("XIX");
                        break;
                    case 20:
                        System.out.println("XX");
                        break;
                    case 21:
                        System.out.println("XXI");
                        break;
                    case 22:
                        System.out.println("XXII");
                        break;
                    case 23:
                        System.out.println("XXIII");
                        break;
                    case 24:
                        System.out.println("XXIV");
                        break;
                    case 25:
                        System.out.println("XXV");
                        break;
                    case 26:
                        System.out.println("LI");
                        break;
                    case 27:
                        System.out.println("LII");
                        break;
                    case 28:
                        System.out.println("LIII");
                        break;
                    case 29:
                        System.out.println("LIV");
                        break;
                    case 30:
                        System.out.println("LV");
                        break;
                    case 31:
                        System.out.println("LVI");
                        break;
                    case 32:
                        System.out.println("LVII");
                        break;
                    case 33:
                        System.out.println("LVIII");
                        break;
                    case 34:
                        System.out.println("LIX");
                        break;
                    case 35:
                        System.out.println("LX");
                        break;
                    case 36:
                        System.out.println("LXI");
                        break;
                    case 37:
                        System.out.println("LXII");
                        break;
                    case 38:
                        System.out.println("LXIII");
                        break;
                    case 39:
                        System.out.println("LXIV");
                        break;
                    case 40:
                        System.out.println("LXV");
                        break;
                    case 41:
                        System.out.println("LXVI");
                        break;
                    case 42:
                        System.out.println("LXVII");
                        break;
                    case 43:
                        System.out.println("LXVIII");
                        break;
                    case 44:
                        System.out.println("LXIX");break;
                    case 45:
                        System.out.println("LXX");break;
                    case 46:
                        System.out.println("LXXI");break;
                    case 47:
                        System.out.println("LXXII");break;
                    case 48:
                        System.out.println("LXXIII");break;
                    case 49:
                        System.out.println("LXIX");break;
                    case 50:
                        System.out.println("L");break;
                    case 51:
                        System.out.println("LI");break;
                    case 52:
                        System.out.println("LII");break;
                    case 53:
                        System.out.println("LIII");break;
                    case 54:
                        System.out.println("LIV");break;
                    case 55:
                        System.out.println("LV");break;
                    case 56:
                        System.out.println("LVI");break;
                    case 57:
                        System.out.println("LVII");break;
                    case 58:
                        System.out.println("LVIII");break;
                    case 59:
                        System.out.println("LIX");break;
                    case 60:
                        System.out.println("LX");break;
                    case 61:
                        System.out.println("LXI");break;
                    case 62:
                        System.out.println("LXII");break;
                    case 63:
                        System.out.println("LXIII");break;
                    case 64:
                        System.out.println("LXIV");break;
                    case 65:
                        System.out.println("LXV");break;
                    case 66:
                        System.out.println("LXVI");break;
                    case 67:
                        System.out.println("LXVII");break;
                    case 68:
                        System.out.println("LXVIII");break;
                    case 69:
                        System.out.println("LXIX");break;
                    case 70:
                        System.out.println("LXX");break;
                    case 71:
                        System.out.println("LXXI");break;
                    case 72:
                        System.out.println("LXII");break;
                    case 73:
                        System.out.println("LXIII");break;
                    case 74:
                        System.out.println("LXXIV");break;
                    case 75:
                        System.out.println("LXXV");break;
                    case 76:
                        System.out.println("LXXVI");break;
                    case 77:
                        System.out.println("LXXVII");break;
                    case 78:
                        System.out.println("LXXVIII");break;
                    case 79:
                        System.out.println("LXXIX");break;
                    case 80:
                        System.out.println("LXXX");break;
                    case 81:
                        System.out.println("LXXX");break;
                    case 82:
                        System.out.println("LXXXI");break;
                    case 83:
                        System.out.println("LXXXII");break;
                    case 84:
                        System.out.println("LXXXIV");break;
                    case 85:
                        System.out.println("LXXXV");break;
                    case 86:
                        System.out.println("LXXXVI");break;
                    case 87:
                        System.out.println("LXXXVII");break;
                    case 88:
                        System.out.println("LXXXVIII");break;
                    case 89:
                        System.out.println("LXXXIX");break;
                    case 90:
                        System.out.println("XC");break;
                    case 91:
                        System.out.println("XCI");break;
                    case 92:
                        System.out.println("XCII");break;
                    case 93:
                        System.out.println("XCIII");break;
                    case 94:
                        System.out.println("XCIV");break;
                    case 95:
                        System.out.println("XCV");break;
                    case 96:
                        System.out.println("XCVI");break;
                    case 97:
                        System.out.println("XCVII");break;
                    case 98:
                        System.out.println("XCVIX");break;
                    case 99:
                        System.out.println("XCIX");break;
                    case 100:
                        System.out.println("C");break;
                    default:
                        System.out.println("False number");
                }
            }




        if (!Roman) {
            int FirstNum = Integer.parseInt(st1); //меняем строковые значения в инт и чар

            int SecondNum = Integer.parseInt(st3);


            if (FirstNum < 1 || FirstNum > 10 || SecondNum < 1 || SecondNum > 10) { // на ввод принимаются целые числа от 1 до 10 иначе программа авершится
                System.out.println("Integers from 1 to 10 are accepted for input");
                System.exit(1);
            }


            int result; // считаем Арабские
            switch (Operation) {
                case '+':
                    result = FirstNum + SecondNum;
                    System.out.println(result);
                    break;
                case '-':
                    result = FirstNum - SecondNum;
                    System.out.println(result);
                    break;
                case '/':
                    result = FirstNum / SecondNum;
                    System.out.println(result);
                    break;
                case '*':
                    result = FirstNum * SecondNum;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("operator not found");
            }


        }
    }
}
// Ура !!!!! Моя первая программа !!!



