package exp.Connect.handle_corpus;

import io.CorpusExtractor;

/**
 * Created by niejia on 16/1/30.
 */
public class ExtractConnectCorpus {
    public static void main(String[] args) {
        String[] changes = {
//                "841",
//                "841-1",
//                "843",
//                "843-1",
//                "847",
//                "847-1",
//                "839",
//                "839-1",
//                "321",
//                "321-1",
//                "840",
//                "840-1",
//                "1121",
//                "1121-1",
//                "1123",
//                "1123-1",
//                "1241",
//                "1241-1",
//                "1242",
//                "1242-1",
//                "1243",
//                "1243-1",
//                "1244",
//                "1244-1",
                "1346",
                "1346-1",
        };
        for (String vNumber : changes) {
            String projectName = "Connect";
            String versionName = "change" + vNumber;
            CorpusExtractor ce = new CorpusExtractor(projectName, versionName);
            ce.process();
        }
    }
}
