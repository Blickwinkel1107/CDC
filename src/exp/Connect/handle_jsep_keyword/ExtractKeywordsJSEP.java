package exp.Connect.handle_jsep_keyword;

import io.KeyWordsReader;

/**
 * Created by niejia on 15/11/30.
 */
public class ExtractKeywordsJSEP {
    public static void main(String[] args) {
        String[] changes = {"change847","change840", "change841", "change843", "change1123", "change1242", "change1244"};

        for (String vNumber : changes) {
            KeyWordsReader.cleanFormat("Connect", vNumber);
        }
    }
}
