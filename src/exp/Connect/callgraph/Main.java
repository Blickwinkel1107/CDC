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
 * Created by niejia on 16/1/30.
 */
public class Main {

    public static void main(String[] args) {

        RelationInfo relationInfo = new RelationInfo(ConnectSetting.Code_Change841_After, Granularity.METHOD, false);
        relationInfo.setPruning(2);

        CallRelationGraph callGraph = new CallRelationGraph(relationInfo);

        TextDataset textDataset_change = new TextDataset(AqualushSetting.Aqualush_Change99_GroupedByJSEP,
                AppConfigure.Aqualush_CleanedRequirement, AqualushSetting.AqualushOracleChange4);

        String layoutPath = "data/Aqualush/relation/changedCallGraph_method_version_ch4.out";
        VisualRelationGraph visualRelationGraph = new VisualRelationGraph(textDataset_change, callGraph, layoutPath, AqualushSetting.MethodChanges4, "Change4");
        visualRelationGraph.show();

        System.out.println("");
    }

}
