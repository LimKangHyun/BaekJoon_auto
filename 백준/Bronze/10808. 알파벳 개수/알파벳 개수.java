import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];  // 알파벳 개수를 저장하는 배열
        String s = br.readLine();  // 단어 입력받기

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;  // 알파벳 개수 1씩 늘려주기
        }

        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();  // 버퍼 비우기
    }
}