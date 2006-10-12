package uk.ac.shef.wit.simmetrics.task;

import uk.ac.shef.wit.simmetrics.similaritymetrics.AbstractStringMetric;
import uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkan;
import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein;
import uk.ac.shef.wit.simmetrics.utils.FileLoader;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Description: a simple single metric task.
 *
 * @author Sam Chapman, NLP Group, Sheffield Uni, UK
 *         (<a href="mailto:sam@dcs.shef.ac.uk">email</a>, <a href="http://www.dcs.shef.ac.uk/~sam/">website</a>)
 *         <p/>
 *         Date: 29-Mar-2006
 *         Time: 20:12:23
 */
public class SimpleTask implements InterfaceTask {

    public static void main(final String[] args) {
        SimpleTask task = new SimpleTask();
    }

    public SimpleTask() {
        //todo test constructor remove this when code is stabilised

        XMLEncoder e = null;
        try {
            e = new XMLEncoder(
                                      new BufferedOutputStream(
                                          new FileOutputStream("C:\\Config.xml")));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        ArrayList<AbstractStringMetric> array = new ArrayList<AbstractStringMetric>();
        AbstractStringMetric metric = new MongeElkan(new Levenshtein());
//        ((MongeElkan)metric).
        array.add(metric);
        assert e != null;
        e.writeObject(array);

        e.close();
    }

    /**
     * Runs the task.
     *
     * @return a TaskResult object.
     */
    public TaskResult RunTask() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Parses the task from the given uri.
     *
     * @param path the path of the task definition file
     */
    public void ParseTask(String path) {
        StringBuffer fileContent = FileLoader.fileToString(new File(path));


    }
}
