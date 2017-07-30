/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.sorting.ide.contentassist.antlr.internal.InternalSortingParser;
import org.xtext.example.sorting.services.SortingGrammarAccess;

public class SortingParser extends AbstractContentAssistParser {

	@Inject
	private SortingGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSortingParser createParser() {
		InternalSortingParser result = new InternalSortingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParamAccess().getAlternatives_1_1(), "rule__Param__Alternatives_1_1");
					put(grammarAccess.getTypeAccess().getTypeAlternatives_0_0(), "rule__Type__TypeAlternatives_0_0");
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getInstanceAccess().getAlternatives_2_1(), "rule__Instance__Alternatives_2_1");
					put(grammarAccess.getTransitionAccess().getAlternatives_6(), "rule__Transition__Alternatives_6");
					put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getParamAccess().getGroup_1(), "rule__Param__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getSourceAccess().getGroup(), "rule__Source__Group__0");
					put(grammarAccess.getSourceAccess().getGroup_5(), "rule__Source__Group_5__0");
					put(grammarAccess.getSourceAccess().getGroup_5_2(), "rule__Source__Group_5_2__0");
					put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
					put(grammarAccess.getFilterAccess().getGroup_7(), "rule__Filter__Group_7__0");
					put(grammarAccess.getFilterAccess().getGroup_7_2(), "rule__Filter__Group_7_2__0");
					put(grammarAccess.getSinkAccess().getGroup(), "rule__Sink__Group__0");
					put(grammarAccess.getSinkAccess().getGroup_5(), "rule__Sink__Group_5__0");
					put(grammarAccess.getSinkAccess().getGroup_5_2(), "rule__Sink__Group_5_2__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup_2(), "rule__Instance__Group_2__0");
					put(grammarAccess.getInstanceAccess().getGroup_2_1_0(), "rule__Instance__Group_2_1_0__0");
					put(grammarAccess.getInstanceAccess().getGroup_2_1_0_2(), "rule__Instance__Group_2_1_0_2__0");
					put(grammarAccess.getInstanceAccess().getGroup_2_1_0_5(), "rule__Instance__Group_2_1_0_5__0");
					put(grammarAccess.getInstanceAccess().getGroup_2_1_1(), "rule__Instance__Group_2_1_1__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_6_0(), "rule__Transition__Group_6_0__0");
					put(grammarAccess.getConfigAccess().getNameAssignment_3(), "rule__Config__NameAssignment_3");
					put(grammarAccess.getConfigAccess().getPramsAssignment_4(), "rule__Config__PramsAssignment_4");
					put(grammarAccess.getConfigAccess().getImportsAssignment_5(), "rule__Config__ImportsAssignment_5");
					put(grammarAccess.getConfigAccess().getComponentsAssignment_6(), "rule__Config__ComponentsAssignment_6");
					put(grammarAccess.getConfigAccess().getInstancesAssignment_7(), "rule__Config__InstancesAssignment_7");
					put(grammarAccess.getConfigAccess().getTransitionsAssignment_8(), "rule__Config__TransitionsAssignment_8");
					put(grammarAccess.getParamAccess().getNameAssignment_0(), "rule__Param__NameAssignment_0");
					put(grammarAccess.getParamAccess().getIntAssignment_1_1_0(), "rule__Param__IntAssignment_1_1_0");
					put(grammarAccess.getParamAccess().getStringAssignment_1_1_1(), "rule__Param__StringAssignment_1_1_1");
					put(grammarAccess.getImportAccess().getNameAssignment_1(), "rule__Import__NameAssignment_1");
					put(grammarAccess.getPortAccess().getNameAssignment_0(), "rule__Port__NameAssignment_0");
					put(grammarAccess.getPortAccess().getTypeAssignment_1(), "rule__Port__TypeAssignment_1");
					put(grammarAccess.getTypeAccess().getTypeAssignment_0(), "rule__Type__TypeAssignment_0");
					put(grammarAccess.getSourceAccess().getNameAssignment_1(), "rule__Source__NameAssignment_1");
					put(grammarAccess.getSourceAccess().getPortsAssignment_4(), "rule__Source__PortsAssignment_4");
					put(grammarAccess.getSourceAccess().getMethodAssignment_5_1(), "rule__Source__MethodAssignment_5_1");
					put(grammarAccess.getFilterAccess().getNameAssignment_1(), "rule__Filter__NameAssignment_1");
					put(grammarAccess.getFilterAccess().getInPortAssignment_4(), "rule__Filter__InPortAssignment_4");
					put(grammarAccess.getFilterAccess().getOutPortAssignment_6(), "rule__Filter__OutPortAssignment_6");
					put(grammarAccess.getFilterAccess().getMethodAssignment_7_1(), "rule__Filter__MethodAssignment_7_1");
					put(grammarAccess.getSinkAccess().getNameAssignment_1(), "rule__Sink__NameAssignment_1");
					put(grammarAccess.getSinkAccess().getInPortAssignment_4(), "rule__Sink__InPortAssignment_4");
					put(grammarAccess.getSinkAccess().getMethodAssignment_5_1(), "rule__Sink__MethodAssignment_5_1");
					put(grammarAccess.getInstanceAccess().getComponentAssignment_0(), "rule__Instance__ComponentAssignment_0");
					put(grammarAccess.getInstanceAccess().getNameAssignment_1(), "rule__Instance__NameAssignment_1");
					put(grammarAccess.getInstanceAccess().getMethodAssignment_2_1_0_1(), "rule__Instance__MethodAssignment_2_1_0_1");
					put(grammarAccess.getInstanceAccess().getArgsAssignment_2_1_1_1(), "rule__Instance__ArgsAssignment_2_1_1_1");
					put(grammarAccess.getTransitionAccess().getSourceAssignment_1(), "rule__Transition__SourceAssignment_1");
					put(grammarAccess.getTransitionAccess().getTargetPortAssignment_3(), "rule__Transition__TargetPortAssignment_3");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_6_0_1(), "rule__Transition__TargetAssignment_6_0_1");
					put(grammarAccess.getTransitionAccess().getSourcePortAssignment_6_0_3(), "rule__Transition__SourcePortAssignment_6_0_3");
					put(grammarAccess.getTransitionAccess().getTransitionAssignment_6_1(), "rule__Transition__TransitionAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SortingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SortingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
