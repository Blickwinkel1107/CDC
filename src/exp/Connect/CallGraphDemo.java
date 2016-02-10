package exp.Connect;

import core.type.Granularity;
import relation.CallRelationGraph;
import relation.RelationInfo;

/**
 * Created by niejia on 16/1/23.
 */
public class CallGraphDemo {
    public static void main(String[] args) {
        RelationInfo relationInfo = new RelationInfo("data/Connect/jar/CONNECT-3.3.jar", Granularity.METHOD, false);

        CallRelationGraph callGraph = new CallRelationGraph(relationInfo);

        System.out.println("Hi");
    }
}
