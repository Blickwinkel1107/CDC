package exp.Connect.handle_corpus;

import io.CorpusExtractor;

/**
 * Created by niejia on 16/1/30.
 */
public class ExtractConnectCorpus {
    public static void main(String[] args) {
        String[] changes = {
                "2c30d2a811615a59a62474538aa7d29e8a6423d2",
                "3ee520200c79e8ba3629f0c0acfc1e2a3307bf2f",
                "843",
                "847",
                "843-1",
                "847-1",
        };
        for (String vNumber : changes) {
            String projectName = "Connect";
            String versionName = "change" + vNumber;
            CorpusExtractor ce = new CorpusExtractor(projectName, versionName);
            ce.process();
        }
    }
}
