package org.synyx.campdemo.write.agileproject.domain.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;


public final class CommitBacklogItemCommand {

    @TargetAggregateIdentifier
    private final String backlogItemIdentifier;
    private final String sprintIdentifier;

    public CommitBacklogItemCommand(String backlogItemIdentifier, String sprintIdentifier) {

        this.backlogItemIdentifier = backlogItemIdentifier;
        this.sprintIdentifier = sprintIdentifier;
    }

    public String getBacklogItemIdentifier() {

        return backlogItemIdentifier;
    }


    public String getSprintIdentifier() {

        return sprintIdentifier;
    }
}