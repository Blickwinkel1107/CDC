package exp.Aqualush.aqualush_callgraph;

import core.dataset.TextDataset;
import core.type.Granularity;
import exp.Aqualush.AqualushSetting;
import io.CorpusExtractor;
import relation.CallRelationGraph;
import relation.RelationInfo;
import util.AppConfigure;
import visual.VisualRelationGraph;

/**
 * Created by niejia on 16/2/11.
 */
public class AqualushMethodCallChangeGraph_ch5_onlyChangedPart {
    public static void main(String[] args) {

        CorpusExtractor corpus4 = new CorpusExtractor("Aqualush", "change4");
        CorpusExtractor corpus5 = new CorpusExtractor("Aqualush", "change5");

        RelationInfo relationInfo = new RelationInfo(AqualushSetting.Change4_JAR, AqualushSetting.Change5_JAR, corpus4, corpus5, AqualushSetting.ArtifactChanges5, Granularity.METHOD, false);
        relationInfo.setPruning(-1);

        CallRelationGraph callGraph = new CallRelationGraph(relationInfo);

        TextDataset textDataset_change = new TextDataset(AqualushSetting.Aqualush_Change5_GroupedByJSEP,
                AppConfigure.Aqualush_CleanedRequirement, AqualushSetting.AqualushOracleChange5);

        String layoutPath = "data/Aqualush/relation/changedCallGraph_method_ch5_pruned.out";
        VisualRelationGraph visualRelationGraph = new VisualRelationGraph(textDataset_change, callGraph, layoutPath, AqualushSetting.ArtifactChanges5, "Change5");
        visualRelationGraph.show();
    }
}
