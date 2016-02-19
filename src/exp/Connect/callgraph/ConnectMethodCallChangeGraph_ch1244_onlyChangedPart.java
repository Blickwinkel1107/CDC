package exp.Connect.callgraph;

import core.dataset.TextDataset;
import core.type.Granularity;
import exp.Connect.ConnectSetting;
import io.CorpusExtractor;
import relation.CallRelationGraph;
import relation.RelationInfo;
import visual.VisualRelationGraph;

/**
 * Created by niejia on 16/2/19.
 */
public class ConnectMethodCallChangeGraph_ch1244_onlyChangedPart {
    public static void main(String[] args) {

        CorpusExtractor corpusChange1244_before = new CorpusExtractor("Connect", ConnectSetting.Change1244_Before);
        CorpusExtractor corpusChange1244_after = new CorpusExtractor("Connect", ConnectSetting.Change1244_After);

        RelationInfo relationInfo = new RelationInfo(false, ConnectSetting.Code_Change1244_Before, ConnectSetting.Code_Change1244_After, corpusChange1244_before, corpusChange1244_after,
                ConnectSetting.ArtifactChanges1244, Granularity.METHOD);

//        RelationInfo relationInfo = new RelationInfo(ConnectSetting.Code_Change1241_Before, ConnectSetting.Code_Change1241_After, corpusChange1241_before, corpusChange1241_after, ConnectSetting.ArtifactChanges1241, Granularity.METHOD, false);
        relationInfo.setPruning(-1);

        CallRelationGraph callGraph = new CallRelationGraph(relationInfo);

        TextDataset textDataset_change = new TextDataset(ConnectSetting.Change1244_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1244);

        String layoutPath = "data/Connect/relation/changedCallGraph_method_ch4_pruned.out";
        VisualRelationGraph visualRelationGraph = new VisualRelationGraph(textDataset_change, callGraph, layoutPath, ConnectSetting.ArtifactChanges1244, "Change1244");
        visualRelationGraph.show();
    }
}
