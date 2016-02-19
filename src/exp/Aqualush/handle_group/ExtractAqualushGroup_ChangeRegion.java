package exp.Aqualush.handle_group;

import core.type.Granularity;
import exp.Aqualush.AqualushSetting;
import group.ChangeRegionsAlgorithm;
import io.CorpusExtractor;

/**
 * Created by niejia on 16/1/3.
 */
public class ExtractAqualushGroup_ChangeRegion {
    public static void main(String[] args) {

        CorpusExtractor corpus3 = new CorpusExtractor("Aqualush", "change3");
        CorpusExtractor corpus4 = new CorpusExtractor("Aqualush", "change4");
        CorpusExtractor corpus5 = new CorpusExtractor("Aqualush", "change5");
        CorpusExtractor corpus6 = new CorpusExtractor("Aqualush", "change6");
        CorpusExtractor corpus7 = new CorpusExtractor("Aqualush", "change7");
        CorpusExtractor corpus0 = new CorpusExtractor("Aqualush", "change0");
        CorpusExtractor corpus99 = new CorpusExtractor("Aqualush", "change99");

//        group("change3", "change4", AqualushSetting.Change3_JAR, AqualushSetting.Change4_JAR,
//                AqualushSetting.MethodChanges4, AqualushSetting.FieldChanges4,Granularity.METHOD,
//                corpus3, corpus4, AqualushSetting.Aqualush_ChangeRegionPath);
////
//        group("change4", "change5", AqualushSetting.Change4_JAR, AqualushSetting.Change5_JAR,
//                AqualushSetting.DiffChanges5, Granularity.METHOD,
//                corpus4, corpus5, AqualushSetting.Aqualush_ChangeRegionPath,  AqualushSetting.AqualushChangesFromJDiff_ch4);
//
//        group("change6", "change7", AqualushSetting.Change6_JAR, AqualushSetting.Change7_JAR,
//                AqualushSetting.DiffChanges7, Granularity.METHOD,
//                corpus6, corpus7, AqualushSetting.Aqualush_ChangeRegionPath,  AqualushSetting.AqualushChangesFromJDiff_ch4);
//
//        group("change0", "change99", AqualushSetting.Change0_JAR, AqualushSetting.Change99_JAR,
//                AqualushSetting.DiffChanges99, Granularity.METHOD,
//                corpus0, corpus99, AqualushSetting.Aqualush_ChangeRegionPath,  AqualushSetting.AqualushChangesFromJDiff_ch4);

        group("change3", "change4", AqualushSetting.Change3_JAR, AqualushSetting.Change4_JAR,
                AqualushSetting.ArtifactChanges4, Granularity.METHOD,
                corpus3, corpus4, AqualushSetting.Aqualush_ChangeRegionPath);

        group("change4", "change5", AqualushSetting.Change4_JAR, AqualushSetting.Change5_JAR,
                AqualushSetting.ArtifactChanges5, Granularity.METHOD,
                corpus4, corpus5, AqualushSetting.Aqualush_ChangeRegionPath);
//
        group("change6", "change7", AqualushSetting.Change6_JAR, AqualushSetting.Change7_JAR,
                AqualushSetting.ArtifactChanges7, Granularity.METHOD,
                corpus6, corpus7, AqualushSetting.Aqualush_ChangeRegionPath);

        group("change0", "change99", AqualushSetting.Change0_JAR, AqualushSetting.Change99_JAR,
                AqualushSetting.ArtifactChanges99, Granularity.METHOD,
                corpus0, corpus99, AqualushSetting.Aqualush_ChangeRegionPath);

    }

    public static void group(String oldVersion, String newVersion, String oldJar, String newJar,
                             String diffChanges, Granularity granularity, CorpusExtractor oldCorpus, CorpusExtractor newCorpus, String groupByMethodPath) {
        System.out.println("------------------------");
        System.out.println("Change " + oldVersion + " to " + newVersion + ":");
        ChangeRegionsAlgorithm ge = new ChangeRegionsAlgorithm(oldVersion, newVersion, oldJar, newJar, diffChanges, granularity, oldCorpus, newCorpus, groupByMethodPath);
        ge.process();
    }
}
