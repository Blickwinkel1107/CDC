package exp.Connect.handle_group;

import core.type.Granularity;
import exp.Connect.ConnectSetting;
import group.ChangeRegionsAlgorithm;
import io.CorpusExtractor;

/**
 * Created by niejia on 16/1/30.
 */
public class ExtractConnectGroup_ChangeRegion {

    public static void main(String[] args) {

        CorpusExtractor corpusChange841_before = new CorpusExtractor("Connect", ConnectSetting.Change841_Before);
        CorpusExtractor corpusChange841_after = new CorpusExtractor("Connect", ConnectSetting.Change841_After);

        group(ConnectSetting.Change841_Before, ConnectSetting.Change841_After, ConnectSetting.Code_Change841_Before, ConnectSetting.Code_Change841_After,
                ConnectSetting.MethodChanges841, Granularity.METHOD,
                corpusChange841_before, corpusChange841_after, ConnectSetting.ChangeRegionPath, ConnectSetting.ChangesFromJDiff_ch841);

//        group(ConnectSetting.Change843_Before, ConnectSetting.Change843_After, ConnectSetting.Code_Change843_Before, ConnectSetting.Code_Change843_After,
//                ConnectSetting.MethodChanges843, Granularity.METHOD,
//                corpusChange841_before, corpusChange841_after, ConnectSetting.ChangeRegionPath, ConnectSetting.ChangesFromJDiff_ch843);

//        group(ConnectSetting.Change847_Before, ConnectSetting.Change847_After, ConnectSetting.Code_Change847_Before, ConnectSetting.Code_Change847_After,
//                ConnectSetting.MethodChanges847, Granularity.METHOD,
//                corpusChange841_before, corpusChange841_after, ConnectSetting.ChangeRegionPath, ConnectSetting.ChangesFromJDiff_ch847);
    }

    public static void group(String oldVersion, String newVersion, String oldJar, String newJar,
                             String methodChanges, Granularity granularity, CorpusExtractor oldCorpus, CorpusExtractor newCorpus, String groupByMethodPath, String changesFromJDiff) {
        System.out.println("------------------------");
        System.out.println("Change " + oldVersion + " to " + newVersion + ":");
        ChangeRegionsAlgorithm ge = new ChangeRegionsAlgorithm(oldVersion, newVersion, oldJar, newJar, methodChanges, granularity, oldCorpus, newCorpus, groupByMethodPath, changesFromJDiff);
        ge.process();
    }
}
