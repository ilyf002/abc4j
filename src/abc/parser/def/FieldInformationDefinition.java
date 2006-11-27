package abc.parser.def;

import scanner.AutomataDefinition;
import scanner.State;
import scanner.Transition;
import abc.parser.AbcTokenType;

/** **/
public class FieldInformationDefinition extends AutomataDefinition
{
    public FieldInformationDefinition()
    { buildDefinition(); }

    protected void buildDefinition()
    {
        State startingState = new State(AbcTokenType.UNKNOWN, false);
        Transition trans = new Transition(startingState,'I');
        getStartingState().addTransition(trans);
        startingState.addTransition(new IsColonTransition(new State(AbcTokenType.FIELD_INFORMATION, true)));
    }

}

