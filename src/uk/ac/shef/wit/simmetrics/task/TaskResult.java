package uk.ac.shef.wit.simmetrics.task;

/**
 * Description: a task result from running a task.
 *
 * @author Sam Chapman, NLP Group, Sheffield Uni, UK
 *         (<a href="mailto:sam@dcs.shef.ac.uk">email</a>, <a href="http://www.dcs.shef.ac.uk/~sam/">website</a>)
 *         <p/>
 *         Date: 29-Mar-2006
 *         Time: 18:10:15
 */
public class TaskResult {

    /**
     * the internal String result of the task Result.
     */
    private String result = "";

    /**
     * Returns a string representation of the object. In general, the
     * <code>toString</code> method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The <code>toString</code> method for class <code>Object</code>
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `<code>@</code>', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return  a string representation of the object.
     */
    public String toString() {
        return result;
    }
}
