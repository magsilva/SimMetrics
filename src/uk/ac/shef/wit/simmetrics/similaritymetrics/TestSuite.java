/**
 * SimMetrics - SimMetrics is a java library of Similarity or Distance
 * Metrics, e.g. Levenshtein Distance, that provide float based similarity
 * measures between String Data. All metrics return consistant measures
 * rather than unbounded similarity scores.
 *
 * Copyright (C) 2005 Sam Chapman - Open Source Release v1.1
 *
 * Please Feel free to contact me about this library, I would appreciate
 * knowing quickly what you wish to use it for and any criticisms/comments
 * upon the SimMetric library.
 *
 * email:       s.chapman@dcs.shef.ac.uk
 * www:         http://www.dcs.shef.ac.uk/~sam/
 * www:         http://www.dcs.shef.ac.uk/~sam/stringmetrics.html
 *
 * address:     Sam Chapman,
 *              Department of Computer Science,
 *              University of Sheffield,
 *              Sheffield,
 *              S. Yorks,
 *              S1 4DP
 *              United Kingdom,
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package uk.ac.shef.wit.simmetrics.similaritymetrics;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 23-Nov-2006
 * Time: 13:15:07
 * To change this template use File | Settings | File Templates.
 */
public class TestSuite extends TestCase {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp() {
        //create objects for testing
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown() {
        // release objects under test here, if necessary
    }

    /**
     * Tests emptying the cart.
     */
    public void testAll() {
        //test packages
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.costfunctions.TestSuite());

        //test local tests
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.BlockDistanceTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.CandidatesTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviationTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMatchingSoundexTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMeanLengthTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanOrderedNameCompoundSimilarityTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.CosineSimilarityTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.DiceSimilarityTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.EuclideanDistanceTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.JaccardSimilarityTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.JaroTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinklerTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.LevenshteinTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.MatchingCoefficientTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkanTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.NeedlemanWunchTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.OverlapCoefficientTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.QGramsDistanceTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohWindowedAffineTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.SoundexTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkTest());
        TestRunner.run(new uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkTokenTest());
    }
}
