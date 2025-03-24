import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] arags) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("確認したいデザインパターンを入力してください。");
        String str = null;
        str = br.readLine();

        switch (str) {
            case "iterator":
            IteratorStr iteratorStr = new IteratorStr();
                break;
        
            default:
            System.out.println("そのようなデザインパターンは存在しません。再度実行し直してください");
                break;
        }
    }
}
