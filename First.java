 import practice.kitasoft;
 import java.io.*;
 
 class First {

    static BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
     public static void main(String[] args)  throws IOException{

        boolean roop = true;
        do {
            Result result = selectProblem();

            switch (result.title) {
                case "1":
                switch (result.number) {
                    case "1":
                        // 練習問題1
                        kitasoft.practice1.q1();
                        break;
                    case "2":
                        // 練習問題2
                        kitasoft.practice1.q2();
                        break;
                    case "3":
                        // 練習問題3
                        kitasoft.practice1.q3();
                        break;
                    case "4":
                        // 練習問題4
                        kitasoft.practice1.q4();
                        break;
                    case "5":
                        // 練習問題5
                        kitasoft.practice1.q5();
                        break;
                    case "6":
                        // 練習問題6
                        kitasoft.practice1.q6();
                        break;
                    case "7":
                        // 練習問題7
                        kitasoft.practice1.q7();
                        break;
                    case "8":
                        // 練習問題8
                        kitasoft.practice1.q8();
                        break;
                    case "9":
                        // 練習問題9
                        kitasoft.practice1.q9();
                        break;
                    case "10":
                        // 練習問題10
                        kitasoft.practice1.q10();
                        break;
                    case "11":
                        // 練習問題11
                        kitasoft.practice1.q11();
                        break;
                    case "12":
                        // 練習問題12
                        kitasoft.practice1.q12();
                        break;
                    default:
                        break;
                }
                break;
        
                case "2":
                switch (result.number) {
                    case "1":
                        // 練習問題1
                        kitasoft.practice2.q1();
                        break;
                    case "2":
                        // 練習問題2
                        kitasoft.practice2.q2();
                        break;
                    case "3":
                        // 練習問題3
                        kitasoft.practice2.q3();
                        break;
                    case "4":
                        // 練習問題4
                        kitasoft.practice2.q4();
                        break;
                    case "5":
                        // 練習問題5
                        kitasoft.practice2.q5();
                        break;
                    case "6":
                        // 練習問題5
                        kitasoft.practice2.q6();
                        break;
                    default:
                        break;
                }
            break;
                case "3" :    
                switch (result.number) {
                    case "1":
                        // 練習問題1
                        kitasoft.practice3.q1();
                        break;
                    case "2":
                        // 練習問題2
                        kitasoft.practice3.q2();
                        break;
                    case "3":
                        // 練習問題3
                        kitasoft.practice3.q3();
                        break;
                    case "4":
                        // 練習問題4
                        kitasoft.practice3.q4();
                        break;
                    case "5":
                        // 練習問題5
                        kitasoft.practice3.q5();
                        break;
                    case "6":
                        // 練習問題6
                        kitasoft.practice3.q6();
                        break;
                    case "7":
                        // 練習問題7
                        kitasoft.practice3.q7();
                        break;
                    case "8":
                        // 練習問題8
                        kitasoft.practice3.q8();
                        break;
                    case "9":
                        // 練習問題9
                        kitasoft.practice3.q9();
                        break;
                    case "10":
                        // 練習問題10
                        kitasoft.practice3.q10();
                        break;
                    case "11":
                        // 練習問題11
                        kitasoft.practice3.q11();
                        break;
                    case "12":
                        // 練習問題12
                        // kitasoft.practice3.q12();
                        break;
                    case "13":
                        // 練習問題13
                        kitasoft.practice3.q13();
                        break;
                    default:
                        break;
                }
                case "4":
                switch (result.number) {
                    case "1":
                        // 練習問題1
                        kitasoft.practice4.q1();
                        break;
                    case "2":
                        // 練習問題2
                        kitasoft.practice4.q2();
                        break;
                    case "3":
                        // 練習問題3
                        kitasoft.practice4.q3();
                        break;
                    case "4":
                        // 練習問題4
                        kitasoft.practice4.q4();
                        break;
                    case "5":
                        // 練習問題5
                        kitasoft.practice4.q5();
                        break;
                    case "6":
                        // 練習問題6
                        kitasoft.practice4.q6();
                        break;
                    case "7":
                        // 練習問題7
                        kitasoft.practice4.q7();
                        break;
                    case "8":
                        // 練習問題8
                        kitasoft.practice4.q8();
                        break;
                    case "9":
                        // 練習問題9
                        kitasoft.practice4.q9();
                        break;
                    case "10":
                        // 練習問題10
                        kitasoft.practice4.q10();
                        break;
                    case "11":
                        // 練習問題11
                        kitasoft.practice4.q11();
                        break;
                    case "12":
                        // 練習問題12
                        kitasoft.practice4.q12();
                        break;
                    case "13":
                        // 練習問題13
                        kitasoft.practice4.q13();
                        break;
                    case "14":
                        // 練習問題14
                        kitasoft.practice4.q14();
                        break;
                    case "15":
                        // 練習問題15
                        kitasoft.practice4.q15();
                        break;
                    case "16":
                        // 練習問題16
                        kitasoft.practice4.q16();
                        break;
                    case "17":
                        // 練習問題17
                        kitasoft.practice4.q17();
                        break;
                    case "18":
                        // 練習問題18
                        kitasoft.practice4.q18();
                        break;
                    case "19":
                        // 練習問題19
                        kitasoft.practice4.q19();
                        break;
                    case "20":
                        // 練習問題16
                        kitasoft.practice4.q20();
                        break;
                    default:
                        break;
                }
                    break;
                default:
                    break;
            }

            System.out.println("もう一度おこないます？");
            System.out.println("1=yes、2=no");
            int response = Integer.parseInt(br.readLine());

            if (response == 2) {
                roop = false;
            }

        } while (roop);
    } 

    public static Result selectProblem() throws IOException{
        
        System.out.println("確認したい練習問題の題名の番号を入力してください。");
        System.out.println("1.表示" );
        System.out.println("2.入力" );
        System.out.println("3.分岐" );
        System.out.println("4.繰り返し" );
        String  title = br.readLine();
        System.out.println("確認したい練習問題の番号を入力してください。");
        String  number = br.readLine();

        return new Result(title, number);
    }
}

class Result {
    public String title;
    public String number;

    public Result(String title, String number) {
        this.title = title;
        this.number = number;
    }
}