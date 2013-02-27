/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.ConversationLink;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.InteractionNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InteractionNodeValidator {
    boolean validate();

    boolean validateIncomingConversationLinks(EList<ConversationLink> value);

    boolean validateOutgoingConversationLinks(EList<ConversationLink> value);
}