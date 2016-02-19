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
        CorpusExtractor corpusChange843_before = new CorpusExtractor("Connect", ConnectSetting.Change843_Before);
        CorpusExtractor corpusChange843_after = new CorpusExtractor("Connect", ConnectSetting.Change843_After);
        CorpusExtractor corpusChange847_before = new CorpusExtractor("Connect", ConnectSetting.Change847_Before);
        CorpusExtractor corpusChange847_after = new CorpusExtractor("Connect", ConnectSetting.Change847_After);
        CorpusExtractor corpusChange839_before = new CorpusExtractor("Connect", ConnectSetting.Change839_Before);
        CorpusExtractor corpusChange839_after = new CorpusExtractor("Connect", ConnectSetting.Change839_After);
        CorpusExtractor corpusChange321_before = new CorpusExtractor("Connect", ConnectSetting.Change321_Before);
        CorpusExtractor corpusChange321_after = new CorpusExtractor("Connect", ConnectSetting.Change321_After);
        CorpusExtractor corpusChange840_before = new CorpusExtractor("Connect", ConnectSetting.Change840_Before);
        CorpusExtractor corpusChange840_after = new CorpusExtractor("Connect", ConnectSetting.Change840_After);
        CorpusExtractor corpusChange1121_before = new CorpusExtractor("Connect", ConnectSetting.Change1121_Before);
        CorpusExtractor corpusChange1121_after = new CorpusExtractor("Connect", ConnectSetting.Change1121_After);
        CorpusExtractor corpusChange1123_before = new CorpusExtractor("Connect", ConnectSetting.Change1123_Before);
        CorpusExtractor corpusChange1123_after = new CorpusExtractor("Connect", ConnectSetting.Change1123_After);
        CorpusExtractor corpusChange1241_before = new CorpusExtractor("Connect", ConnectSetting.Change1241_Before);
        CorpusExtractor corpusChange1241_after = new CorpusExtractor("Connect", ConnectSetting.Change1241_After);
        CorpusExtractor corpusChange1242_before = new CorpusExtractor("Connect", ConnectSetting.Change1242_Before);
        CorpusExtractor corpusChange1242_after = new CorpusExtractor("Connect", ConnectSetting.Change1242_After);
        CorpusExtractor corpusChange1243_before = new CorpusExtractor("Connect", ConnectSetting.Change1243_Before);
        CorpusExtractor corpusChange1243_after = new CorpusExtractor("Connect", ConnectSetting.Change1243_After);
        CorpusExtractor corpusChange1244_before = new CorpusExtractor("Connect", ConnectSetting.Change1244_Before);
        CorpusExtractor corpusChange1244_after = new CorpusExtractor("Connect", ConnectSetting.Change1244_After);
        CorpusExtractor corpusChange1346_before = new CorpusExtractor("Connect", ConnectSetting.Change1346_Before);
        CorpusExtractor corpusChange1346_after = new CorpusExtractor("Connect", ConnectSetting.Change1346_After);

//        group(ConnectSetting.Change841_Before, ConnectSetting.Change841_After, ConnectSetting.Code_Change841_Before, ConnectSetting.Code_Change841_After,
//                ConnectSetting.ArtifactChanges841, Granularity.METHOD,
//                corpusChange841_before, corpusChange841_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change843_Before, ConnectSetting.Change843_After, ConnectSetting.Code_Change843_Before, ConnectSetting.Code_Change843_After,
//                ConnectSetting.ArtifactChanges843, Granularity.METHOD,
//                corpusChange843_before, corpusChange843_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change847_Before, ConnectSetting.Change847_After, ConnectSetting.Code_Change847_Before, ConnectSetting.Code_Change847_After,
//                ConnectSetting.ArtifactChanges847, Granularity.METHOD,
//                corpusChange847_before, corpusChange847_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change839_Before, ConnectSetting.Change839_After, ConnectSetting.Code_Change839_Before, ConnectSetting.Code_Change839_After,
//                ConnectSetting.ArtifactChanges839, Granularity.METHOD,
//                corpusChange839_before, corpusChange839_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change321_Before, ConnectSetting.Change321_After, ConnectSetting.Code_Change321_Before, ConnectSetting.Code_Change321_After,
//                ConnectSetting.ArtifactChanges321, Granularity.METHOD,
//                corpusChange321_before, corpusChange321_after, ConnectSetting.ChangeRegionPath);


//        group(ConnectSetting.Change840_Before, ConnectSetting.Change840_After, ConnectSetting.Code_Change840_Before, ConnectSetting.Code_Change840_After,
//                ConnectSetting.ArtifactChanges840, Granularity.METHOD,
//                corpusChange840_before, corpusChange840_after, ConnectSetting.ChangeRegionPath);

//
//        group(ConnectSetting.Change1121_Before, ConnectSetting.Change1121_After, ConnectSetting.Code_Change1121_Before, ConnectSetting.Code_Change1121_After,
//                ConnectSetting.ArtifactChanges1121, Granularity.METHOD,
//                corpusChange1121_before, corpusChange1121_after, ConnectSetting.ChangeRegionPath);
//
////
//        group(ConnectSetting.Change1123_Before, ConnectSetting.Change1123_After, ConnectSetting.Code_Change1123_Before, ConnectSetting.Code_Change1123_After,
//                ConnectSetting.ArtifactChanges1123, Granularity.METHOD,
//                corpusChange1123_before, corpusChange1123_after, ConnectSetting.ChangeRegionPath);


        group(ConnectSetting.Change1241_Before, ConnectSetting.Change1241_After, ConnectSetting.Code_Change1241_Before, ConnectSetting.Code_Change1241_After,
                ConnectSetting.ArtifactChanges1241, Granularity.METHOD,
                corpusChange1241_before, corpusChange1241_after, ConnectSetting.ChangeRegionPath);

//
//        group(ConnectSetting.Change1242_Before, ConnectSetting.Change1242_After, ConnectSetting.Code_Change1242_Before, ConnectSetting.Code_Change1242_After,
//                ConnectSetting.ArtifactChanges1242, Granularity.METHOD,
//                corpusChange1242_before, corpusChange1242_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change1243_Before, ConnectSetting.Change1243_After, ConnectSetting.Code_Change1243_Before, ConnectSetting.Code_Change1243_After,
//                ConnectSetting.ArtifactChanges1243, Granularity.METHOD,
//                corpusChange1243_before, corpusChange1243_after, ConnectSetting.ChangeRegionPath);
//
//
//        group(ConnectSetting.Change1244_Before, ConnectSetting.Change1244_After, ConnectSetting.Code_Change1244_Before, ConnectSetting.Code_Change1244_After,
//                ConnectSetting.ArtifactChanges1244, Granularity.METHOD,
//                corpusChange1244_before, corpusChange1244_after, ConnectSetting.ChangeRegionPath);

//
//        group(ConnectSetting.Change1346_Before, ConnectSetting.Change1346_After, ConnectSetting.Code_Change1346_Before, ConnectSetting.Code_Change1346_After,
//                ConnectSetting.ArtifactChanges1346, Granularity.METHOD,
//                corpusChange1346_before, corpusChange1346_after, ConnectSetting.ChangeRegionPath);

    }


    public static void group(String oldVersion, String newVersion, String oldJar, String newJar,
                             String diffChanges, Granularity granularity, CorpusExtractor oldCorpus, CorpusExtractor newCorpus, String groupByMethodPath) {
        System.out.println("------------------------");
        System.out.println("Change " + oldVersion + " to " + newVersion + ":");
        ChangeRegionsAlgorithm ge = new ChangeRegionsAlgorithm(oldVersion, newVersion, oldJar, newJar, diffChanges, granularity, oldCorpus, newCorpus, groupByMethodPath);
        ge.process();
    }
}
