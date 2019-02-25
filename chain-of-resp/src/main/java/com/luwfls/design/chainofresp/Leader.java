package com.luwfls.design.chainofresp;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name, Leader nextLeader) {
        this.name = name;
        this.nextLeader = nextLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleLeaveRequest(LeaveRequest leaveRequest);
}

class Director extends Leader {

    public Director(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println(leaveRequest);
            System.out.println("主任审批通过");
        } else {
            if (this.nextLeader != null)
                nextLeader.handleLeaveRequest(leaveRequest);
        }
    }
}

class Manager extends Leader {

    public Manager(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println(leaveRequest);
            System.out.println("经理审批通过");
        } else {
            if (this.nextLeader != null)
                nextLeader.handleLeaveRequest(leaveRequest);
        }
    }
}

class GeneralManager extends Leader{

    public GeneralManager(String name, Leader nextLeader) {
        super(name, nextLeader);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 100) {
            System.out.println(leaveRequest);
            System.out.println("总经理审批通过");
        } else {
            System.out.println("莫非想辞职，不干了？？");
        }
    }
}
