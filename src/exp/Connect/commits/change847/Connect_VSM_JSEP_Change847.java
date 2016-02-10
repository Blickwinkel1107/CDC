package exp.Connect.commits.change847;

import core.algo.JSS2015_CSTI;
import core.dataset.TextDataset;
import core.ir.IR;
import core.ir.IRModelConst;
import core.metrics.Result;
import exp.Connect.ConnectSetting;
import visual.VisualCurve;

/**
 * Created by niejia on 16/2/1.
 */
public class Connect_VSM_JSEP_Change847 {
    public static void main(String[] args) {
        TextDataset textDataset = new TextDataset(ConnectSetting.Change847_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange847);

        Result result_ir = IR.compute(textDataset, IRModelConst.VSM_ALL, new JSS2015_CSTI(), "Change847");
        result_ir.showMatrix();
        result_ir.showAveragePrecisionByRanklist();
        result_ir.showMeanAveragePrecisionByQuery();

        VisualCurve curve = new VisualCurve();
        curve.addLine(result_ir);
        curve.showChart();

    }
}