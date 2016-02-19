package exp.Connect.diff_parser;

import exp.Connect.ConnectSetting;
import parser.DiffParser;

/**
 * Created by niejia on 16/2/10.
 */
public class ConnectDiffParser {

    public static void main(String[] args) {
        DiffParser parser847 = new DiffParser(ConnectSetting.MethodDiff_Change847, ConnectSetting.FieldDiff_Change847, ConnectSetting.Change847_After, ConnectSetting.Change847_Before, "txt");
        DiffParser parser841 = new DiffParser(ConnectSetting.MethodDiff_Change841, ConnectSetting.FieldDiff_Change841, ConnectSetting.Change841_After, ConnectSetting.Change841_Before, "txt");
        DiffParser parser843 = new DiffParser(ConnectSetting.MethodDiff_Change843, ConnectSetting.FieldDiff_Change843, ConnectSetting.Change843_After, ConnectSetting.Change843_Before, "txt");
        DiffParser parser839 = new DiffParser(ConnectSetting.MethodDiff_Change839, ConnectSetting.FieldDiff_Change839, ConnectSetting.Change839_After, ConnectSetting.Change839_Before, "txt");
        DiffParser parser321 = new DiffParser(ConnectSetting.MethodDiff_Change321, ConnectSetting.FieldDiff_Change321, ConnectSetting.Change321_After, ConnectSetting.Change321_Before, "txt");
        DiffParser parser1121 = new DiffParser(ConnectSetting.MethodDiff_Change1121, ConnectSetting.FieldDiff_Change1121, ConnectSetting.Change1121_After, ConnectSetting.Change1121_Before, "txt");
        DiffParser parser1123 = new DiffParser(ConnectSetting.MethodDiff_Change1123, ConnectSetting.FieldDiff_Change1123, ConnectSetting.Change1123_After, ConnectSetting.Change1123_Before, "txt");
        DiffParser parser1241 = new DiffParser(ConnectSetting.MethodDiff_Change1241, ConnectSetting.FieldDiff_Change1241, ConnectSetting.Change1241_After, ConnectSetting.Change1241_Before, "txt");
        DiffParser parser1242 = new DiffParser(ConnectSetting.MethodDiff_Change1242, ConnectSetting.FieldDiff_Change1242, ConnectSetting.Change1242_After, ConnectSetting.Change1242_Before, "txt");
        DiffParser parser1243 = new DiffParser(ConnectSetting.MethodDiff_Change1243, ConnectSetting.FieldDiff_Change1243, ConnectSetting.Change1243_After, ConnectSetting.Change1243_Before, "txt");
        DiffParser parser1244 = new DiffParser(ConnectSetting.MethodDiff_Change1244, ConnectSetting.FieldDiff_Change1244, ConnectSetting.Change1244_After, ConnectSetting.Change1244_Before, "txt");
        DiffParser parser1346 = new DiffParser(ConnectSetting.MethodDiff_Change1346, ConnectSetting.FieldDiff_Change1346, ConnectSetting.Change1346_After, ConnectSetting.Change1346_Before, "txt");

    }

    public static void diff(String diffMethodFile, String diffFieldFile, String newVersion, String oldVersion, String extendName) {
        DiffParser parser = new DiffParser(diffMethodFile, diffFieldFile, newVersion, oldVersion, extendName);
        System.out.println(parser);
        System.out.println("---------------------- ");
    }

}
