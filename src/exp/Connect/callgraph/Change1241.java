package exp.Connect.callgraph;

import core.dataset.TextDataset;
import core.type.Granularity;
import exp.Aqualush.AqualushSetting;
import exp.Connect.ConnectSetting;
import relation.CallRelationGraph;
import relation.RelationInfo;
import util.AppConfigure;
import visual.VisualRelationGraph;

/**
 * Created by niejia on 16/2/19.
 */
public class Change1241 {
    public static void main(String[] args) {

        RelationInfo relationInfo = new RelationInfo(ConnectSetting.Code_Change1241_After, Granularity.METHOD, false);
        relationInfo.setPruning(-1);

        CallRelationGraph callGraph = new CallRelationGraph(relationInfo);

        TextDataset textDataset_change = new TextDataset(AqualushSetting.Aqualush_Change99_GroupedByJSEP,
                AppConfigure.Aqualush_CleanedRequirement, AqualushSetting.AqualushOracleChange4);

        String layoutPath = "data/Aqualush/relation/changedCallGraph_method_version_ch4.out";
        VisualRelationGraph visualRelationGraph = new VisualRelationGraph(textDataset_change, callGraph, layoutPath, ConnectSetting.ArtifactChanges1241, "Change1241");
        visualRelationGraph.show();

        System.out.println("");
    }

}

