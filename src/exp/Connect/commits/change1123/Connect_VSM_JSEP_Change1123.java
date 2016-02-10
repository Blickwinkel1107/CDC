package exp.Connect.commits.change1123;

import core.algo.JSS2015_CSTI;
import core.dataset.TextDataset;
import core.ir.IR;
import core.ir.IRModelConst;
import core.metrics.Result;
import exp.Connect.ConnectSetting;
import visual.VisualCurve;

/**
 * Created by niejia on 16/1/30.
 */
public class Connect_VSM_JSEP_Change1123 {
    public static void main(String[] args) {
        TextDataset textDataset = new TextDataset(ConnectSetting.Change1123_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1123);

        Result result_ir = IR.compute(textDataset, IRModelConst.VSM_ALL, new JSS2015_CSTI(), "Change1123");
        result_ir.showMatrix();
        result_ir.showAveragePrecisionByRanklist();
        result_ir.showMeanAveragePrecisionByQuery();

        VisualCurve curve = new VisualCurve();
        curve.addLine(result_ir);
        curve.showChart();
    }
}
