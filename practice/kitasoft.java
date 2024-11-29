package practice;

import java.io.*;


public class kitasoft {

    public class practice1 {
        public static int x = 0;
        public static int y = 0;

    public static void q1() {
        String text = "Hello World";

        System.out.println(text);
    }

    public static void q2() {
        x = 11;

        System.out.println("x=" + x);
    }

    public static void q3() {
        x = 13;
        y = 17;

        System.out.println("x=" + x + "," + "y=" + y);
    }

    public static void q4() {
        x = 13 + 17;

        System.out.println("x=" + x + " (13 + 17)");
    }

    public static void q5() {
        System.out.println("13 × 17 = " + 13*17);
    }

    public static void q6() {
        x = 7;
        x = x*3;
        System.out.println("x = " + x);

        x = x/2;

        System.out.println("x = " + x);

        
    }

    public static void q7() {
        x = 3;
        y = 7;
        
        int z = x;
        
        x = y;
        y = z;
        System.out.println( "x=" + x + ",y=" + y );
        
    }

    public static void q8() {
        x = 19;
        y = 23;
        
        int z = x*y;
        System.out.println( "z=" + z );
        
    }

    public static void q9() {
        x = 10;
        System.out.println( x*2 + "," + x*3 + "," + x*4);
        
    }

    public static void q10() {
        x = 2;
        System.out.println( x*x + "," + x*x*x + "," + x*x*x*x);
        
    }

    public static void q11() {
        x = 10;
        y = 4;
        System.out.println( x + "を" + y + "で割ると、商は" + x/y + "," + "余は" + x%y);
        
    }

    public static void q12() {
        x = 5;
        System.out.println( "インクリメントすると" + ++x + ",デクリメントすると" + --x);
    }
    }
    
    public class practice2 {
        public static BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        public static void q1() throws IOException{
            
            String  s = br.readLine();

            System.out.println(s);
        
        }

        public static void q2() throws IOException{
            
            String s = br.readLine();

            int x = Integer.parseInt(s);

            System.out.println(x);
        }

        public static void q3() throws IOException{
            
            String s = br.readLine();

            int x = Integer.parseInt(s);

            System.out.println(x + "," + x*x + "," + x*x*x);
        }

        public static void q4() throws IOException{
            
            System.out.println("一つ目の数値を入力してください");

            int x = Integer.parseInt(br.readLine());

            System.out.println("2つ目の数値を入力してください");

            int y = Integer.parseInt(br.readLine());

            int sum = x + y;
            int between = x - y;
            int multiplication = x * y;
            int division = x / y;
            int over = x % y;

            System.out.println("各演算の結果");
            System.out.println("和=" + sum + ",差=" + between + ",積=" + multiplication + ",商と余=" + division + "と" + over);
        }

        public static void q5() throws IOException{
            
            System.out.println("一つ目の数値を入力してください");

            int x = Integer.parseInt(br.readLine());

            System.out.println("2つ目の数値を入力してください");

            int y = Integer.parseInt(br.readLine());

            int sum = x + y;

            System.out.println("2つの平均値=" + sum/2);
        }

        public static void q6() throws IOException{
            
            System.out.println("生まれてから現在までの日数を計算します");
            System.out.println("年齢を教えてください");

            int age = Integer.parseInt(br.readLine());

            System.out.println("生まれてから現在までの日数（1年を365日としています）は");
            System.out.println(age * 365);
        }
    }

    public class practice3 {
        public static int x = 0;
        public static int y = 0;

        public static BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        public static void q1() throws IOException{
            System.out.println("xに入れる数値を入力してください");
            x = Integer.parseInt(br.readLine());
            System.out.println("yに入れる数値を入力してください");
            y = Integer.parseInt(br.readLine());

            if (x > y) {
                System.out.println("xはyより大きい");
            } else {
                System.out.println("yはxより大きい");
            }
        }
        
        public static void q2() throws IOException{
            System.out.println("1つ目の数値を入力してください");
            x = Integer.parseInt(br.readLine());
            System.out.println("2つ目の数値を入力してください");
            y = Integer.parseInt(br.readLine());

            if (x > y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }

        public static void q3() throws IOException{
            System.out.println("xに入れる数値を入力してください");
            x = Integer.parseInt(br.readLine());
            System.out.println("yに入れる数値を入力してください");
            y = Integer.parseInt(br.readLine());

            if (x > y) {
                System.out.println("xはyより大きい");
            } else {
                System.out.println("xはyより小さい");
            }
        }

        public static void q4() throws IOException{
            System.out.println("xに入れる数値を入力してください");
            x = Integer.parseInt(br.readLine());
            System.out.println("yに入れる数値を入力してください");
            y = Integer.parseInt(br.readLine());

            if (x > y) {
                System.out.println("xはyより大きい");
            } else if (x < y) {
                System.out.println("xはyより小さい");
            } else {
                System.out.println("xとyは等しい");
            }
        }

        public static void q5() throws IOException{
            System.out.println("正数値を入力してください。偶数か奇数かを判定します");
            x = Integer.parseInt(br.readLine());

            int result = x % 2;
            

            if (result == 0 ) {
                System.out.println(x + "は偶数です");
            } else {
                System.out.println(x + "は奇数です");
            }
        }

        public static void q6() throws IOException{
            System.out.println("正数値を入力してください。正か負と偶数か奇数かを判定します");
            x = Integer.parseInt(br.readLine());

            int result = x % 2;
            

            if (result == 0 && x < 0 ) {
                System.out.println(x + "は負の偶数です");
            } else if (result == 0 && x >= 0){
                System.out.println(x + "は正の偶数です");
            } else if (result != 0 && x > 0) {
                System.out.println(x + "は正の奇数です");
            } else {
                System.out.println(x + "は負の奇数です");
            } 
        }

        public static void q7() throws IOException{
            System.out.println("成績判定基準を選んでください");
            System.out.println("1.ケース1");
            System.out.println("2.ケース2");
            System.out.println("3.ケース3");
            String basic = br.readLine();

            System.out.println("次にテストの点数を入力してください");

            int point = Integer.parseInt(br.readLine());
            
            switch (basic) {
                case "1":
                    if (point >= 60) {
                        System.out.println("合格");
                    } else {
                        System.out.println("不合格");
                    }
                break;
                case "2":
                    if (point >= 80) {
                        System.out.println("たいへんよくできました。");
                    } else if (point >= 60 && point < 80) {
                        System.out.println("よくできました。");
                    } else {
                        System.out.println("ざんねんでした。");
                    }
                break;
                case "3":
                    if (point >= 80) {
                        System.out.println("優");
                    } else if (point >= 70 && point < 80) {
                        System.out.println("良");
                    } else if (point >= 60 && point < 70){
                        System.out.println("可");
                    } else {
                        System.out.println("不可");
                    }
                break;
            
                default:
                    break;
            }
        }

        public static void q8() throws IOException{
            System.out.println("中間試験の点数を入力してください。");
            int half_test = Integer.parseInt(br.readLine());
            System.out.println("次に期末試験の点数を入力してください。");
            int last_test = Integer.parseInt(br.readLine());

            if (half_test >= 60 && last_test >= 60 || (half_test + last_test >= 130) || (half_test + last_test >= 100 && (half_test > 90 || last_test > 90) )) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        }

        public static void q9() throws IOException{
            System.out.println("曜日を選択してください。");
            System.out.println("0=日曜日,1=月曜日,2=火曜日,3=水曜日,4=木曜日,5=金曜日,6=土曜日");
            int week = Integer.parseInt(br.readLine());
            System.out.println("時間を選択してください。");
            System.out.println("0=午前,1=午後,2=夜間");
            int time = Integer.parseInt(br.readLine());

            String close_text = "休診です。";
            String open_text = "空いています。";

            switch (week) {
                case 0:
                    System.out.println(close_text);
                    break;
                case 1:
                    System.out.println(open_text);
                    break;
                case 2:
                    switch (time) {
                        case 0:
                            System.out.println(close_text);
                            break;
                        case 1,2:
                            System.out.println(open_text);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    switch (time) {
                        case 0,1:
                            System.out.println(open_text);
                            break;
                        case 2:
                            System.out.println(close_text);
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println(open_text);
                    break;
                case 5:
                    switch (time) {
                        case 0:
                            System.out.println(close_text);
                            break;
                        case 1,2:
                            System.out.println(open_text);
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    switch (time) {
                        case 0:
                            System.out.println(open_text);
                            break;
                        case 1,2:
                            System.out.println(close_text);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

        public static void q10() throws IOException{
            System.out.println("1つ目の整数値を入力してください。");
            x = Integer.parseInt(br.readLine());

            System.out.println("2つ目の整数値を入力してください。");
            y = Integer.parseInt(br.readLine());

            if (x < y && (x % 2 == 0 && y % 2 == 0)) {
                System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
            }
            
            if (x == y && x < 0) {
                System.out.println( "xとyは等しく、かつ、負の数である。"  );
            }

            if (x < y || x % 2 == 0) {
                System.out.println( "xはyより小さい、または、xは偶数である。");
            }

            if (x <= 10 || x >= 100 && (y >= 10 && y <= 100)) {
                System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
            } 

            if (x > 0 && y > 0) {
                System.out.println( "xもyも負の数である、ではない。");
            } 
        }
    
        public static void q11() throws IOException{
            System.out.println("対象月を入力してください");
            System.out.println("1=1月,2=2月,3=3月,4=4月,5=5月,6=6月,7=7月,8=8月,9=9月,10=10月,11=11月,12=12月");
            int month = Integer.parseInt(br.readLine());

            switch (month) {
                case 1:
                    System.out.println("元日、成人の日");
                    break;
                case 2:
                    System.out.println("建国記念日の日");
                break;
                case 3:
                    System.out.println("春分の日");
                break;
                case 4:
                    System.out.println("昭和の日");
                break;
                case 5:
                    System.out.println("憲法記念日の日、みどりの日、こどもの日");
                break;
                case 7:
                    System.out.println("海の日");
                break;
                case 9:
                    System.out.println("敬老の日、秋分の日");
                break;
                case 10:
                    System.out.println("体育の日");
                break;
                case 11:
                    System.out.println("分化の日、勤労感謝の日");
                break;
                case 12:
                    System.out.println("天皇誕生日");
                break;
                default:
                    break;
            }
        }

        public static void q13() throws IOException{
            System.out.println("対象月を入力してください");
            System.out.println("1=1月,2=2月,3=3月,4=4月,5=5月,6=6月,7=7月,8=8月,9=9月,10=10月,11=11月,12=12月");
            int month = Integer.parseInt(br.readLine());

            switch (month) {
                case 1:
                    System.out.println("31日");
                    break;
                case 2:
                    System.out.println("28日");
                break;
                case 3:
                    System.out.println("31日");
                break;
                case 4:
                    System.out.println("30日");
                break;
                case 5:
                    System.out.println("31日");
                break;
                case 6:
                    System.out.println("30日");
                break;
                case 7:
                    System.out.println("31日");
                break;
                case 8:
                    System.out.println("31日");
                break;
                case 9:
                    System.out.println("30日");
                break;
                case 10:
                    System.out.println("31日");
                break;
                case 11:
                    System.out.println("30日");
                break;
                case 12:
                    System.out.println("31日");
                break;
                default:
                    System.out.println("入力が間違っています");
                    break;
            }
        }
    }   

    public class practice4 {
        public static int x = 0;
        public static int y = 0;

        public static BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        public static void q1() throws IOException{
            int i = 0;
            while(i < 10) {
                System.out.println("SPAM");

                i++;
            }
        }
        
        public static void q2() throws IOException{
            System.out.println("~九九~");
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + "x" + j + "=" + i*j);
                }
            }

            System.out.println("~3の段~");
            for (int i = 1; i < 28; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }

        public static void q3() throws IOException{
            int start = 2;

            for (int i = 1; i < 9; i++) { 
                if (i != 1) {
                    start =  start * 2;
                } 
                
                System.out.println(start); 
            }
        }
 
        public static void q4() throws IOException{
            int start = 7;

            for (int i = 7; i > 0; i--) { 
                if (i != 7) {
                    start =  start * i;
                } 
                
                System.out.println(start); 
            }
        }

        public static void q5() throws IOException{
            int sum = 0;
            for (int i = 1; i < 11; i++) {
                sum = sum + Integer.parseInt(br.readLine());
            }

            System.out.println(sum / 10);
        }

        public static void q6() throws IOException{
            System.out.println("勝敗を入力してください。");
            System.out.println("0=負け、1=勝ち");

            int lose_count = 0;
            int win_count = 0;

            for (int i = 1; i < 11; i++) {
                System.out.println(i + "回目は？");
                int res = Integer.parseInt(br.readLine());

                if (res == 0) {
                    lose_count++; 
                } else {
                    win_count++;
                }
            }
            System.out.println("負け総数=" + lose_count);
            System.out.println("勝ち総数=" + win_count);
        }

        public static void q7() throws IOException{
            String team1 = "巨人";
            String team2 = "阪神";

            int team1_score = 0;
            int team2_score = 0;


            for (int i = 1; i < 10; i++) {
                System.out.println(i + "回目表、" + team1 + "の得点は？");
                x = Integer.parseInt(br.readLine());
                System.out.println(i + "回目表、" + team2 + "の得点は？");
                y = Integer.parseInt(br.readLine());
                team1_score = team1_score + x;
                team2_score = team1_score + y;
            }

            System.out.println(team1 + ":" + team1_score + "点, 阪神:" + team2_score + "点");

            if (team1_score > team2_score) {
                System.out.println(team1 + "の勝ち");
            } else if( team2_score > team1_score) {
                System.out.println(team2 + "の勝ち");
            } else {
                System.out.println("引き分けです。");
            }
        }

        public static void q8() throws IOException{
            int max = 0;

            for (int i = 1; i < 11; i++){
                int res = Integer.parseInt(br.readLine());

                if (max < res) {
                    max = res;
                }
            }

            System.out.println("最大値:" + max);
        }

        public static void q9() throws IOException{
            int max = 0;
            int min = 0;

            for (int i = 1; i < 11; i++){
                int res = Integer.parseInt(br.readLine());

                if (i == 1) {
                    max = res;
                    min = res;
                } else {
                    if (max < res) {
                        max = res;
                    }

                    if (min > res) {
                        min = res;
                    }
                }
            }

            System.out.println("最大値:" + max);
            System.out.println("最小値:" + min);
        }

        public static void q10() throws IOException{
            System.out.println("正の整数値を入力してください。");
            String result = "";
            int count = Integer.parseInt(br.readLine());

            for (int i = 1; i < count + 1; i++) {
                result = result + "x";
            }

            System.out.println(result);

        }
    
        public static void q11() throws IOException{
            System.out.println("正の整数値を入力してください。");
            int count = Integer.parseInt(br.readLine());
            String result = "";

            for (int i = 0; i < count + 1; i++) {

                int number = i % 10;

                if (number != 0) {
                    result = result + String.valueOf(number);
                } else {
                    result = result + "0";
                }
               
            }

            System.out.println(result);
        }

        public static void q12() throws IOException{
            int sum = 0;

            while (sum <= 100) {
                System.out.println("数値を入力してください。");
                int res = Integer.parseInt(br.readLine());

                sum = sum + res;
            } 

            System.out.println("合計=" + sum);
            
        }

        public static void q13() throws IOException{
            int strike = 0;
            int ball = 0;
            int i = 1;

            System.out.println("ストライクかボールかを入力してください。");
            while(strike < 3 && ball < 4) {
                System.out.println(i + "打席目は？ 1=ストライク、2=ボール");
                int res = Integer.parseInt(br.readLine());

                switch (res) { 
                    case 1:
                        strike++;
                        break;
                    case 2:
                        ball++;
                        break;
                    default:
                        System.out.println("入力値が正しくありません。");
                        break;
                }
                
                i++;
            }

            System.out.println(strike + "ストライク," + ball + "ボール");
        }

        public static void q14() throws IOException{
            int strike = 0;
            int ball = 0;
            int i = 1;

            System.out.println("ストライクかボールかファウルを入力してください。");
            while(strike < 3 && ball < 4) {
                System.out.println(i + "打席目は？ 1=ストライク、2=ボール、3=ファウル");
                int res = Integer.parseInt(br.readLine());

                switch (res) { 
                    case 1:
                        strike++;
                        break;
                    case 2:
                        ball++;
                        break;
                    case 3:
                        if (strike < 2) {
                            strike++;    
                        }
                        break;
                    default:
                        System.out.println("入力値が正しくありません。");
                        break;
                }
                
                i++;
            }

            System.out.println(strike + "ストライク," + ball + "ボール");
        }

        public static void q15() throws IOException{
            System.out.println("数値を入力してください。");
            int res = Integer.parseInt(br.readLine());
            boolean result = true;

            for (int i = 2; i < res; i++) {
                int number = res % i;

                if (number == 0) {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println("素数である。");
            } else {
                System.out.println("素数ではありません。");
            }
        }

        public static void q16() throws IOException{
            System.out.println("数値を入力してください。");
            int res = Integer.parseInt(br.readLine());
            boolean result = true;

            for (int i = 2; i < res; i++) {
                int number = res % i;

                if (number == 0) {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println("1 x " + res);
            } else {
            
            }
        }

        public static void q17() throws IOException{
            
        }

        public static void q18() throws IOException{
            
        }

        public static void q19() throws IOException{
            
        }

        public static void q20() throws IOException{
            
        }

        public static void q21() throws IOException{
            
        }

        public static void q22() throws IOException{
            
        }
    }   
}
