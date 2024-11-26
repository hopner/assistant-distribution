package no.vektorprogrammet.logic;

import java.util.List;

import no.vektorprogrammet.graph.BipartiteGraph;
import no.vektorprogrammet.graph.Graph;
import no.vektorprogrammet.logic.timetables.MathClass;

public class Model {
    
    List<Assistant> assistants;
    List<MathClass> mathClasses;

    BipartiteGraph<Assistant, MathClass> graph;

    public Model(List<Assistant> assistants, List<MathClass> mathClasses) {
        this.assistants = assistants;
        this.mathClasses = mathClasses;
    }

    private void modelAsBipartiteGraph() {
        // TODO
    }
}
