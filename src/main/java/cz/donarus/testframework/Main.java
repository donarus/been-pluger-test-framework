package cz.donarus.testframework;

import cz.cuni.mff.d3s.been.pluger.impl.Pluger;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by donarus on 19.2.15.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Object> config = new HashMap<String, Object>() {{
            put(Pluger.WORKING_DIRECTORY_KEY, new File("/tmp/plugertest/workingdir").toPath());
            put(Pluger.DEPENDENCIES_FINAL_KEY, new ArrayList<>());
        }};
        Pluger pluger = Pluger.create(config);
        pluger.start();
    }
}
