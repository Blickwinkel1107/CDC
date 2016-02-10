package exp.Connect.clean_requirement;

import preprocess.ArtifactPreprocessor;
import util._;

import java.io.File;

/**
 * Created by niejia on 16/1/30.
 */
public class CleanRequirements {
    public static void main(String[] args) {
        String requirementDir = "data/Connect/uc";
        File dirFile = new File(requirementDir);
        if (!dirFile.exists()) {
            _.abort("Directory doesn't exist");
        }

        if (!dirFile.isDirectory()) {
            _.abort("Path should be a directory");
        }

        for (File f : dirFile.listFiles()) {
            String fileName = f.getName();
//            if (fileName.startsWith("SRS")) {
            _.writeFile(ArtifactPreprocessor.handlePureTextFile(_.readFile(f.getPath())), "data/Connect/requirements" + "/" + fileName + ".txt");
//            }
        }
    }
}
