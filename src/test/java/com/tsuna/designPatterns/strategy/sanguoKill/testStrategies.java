package com.tsuna.designPatterns.strategy.sanguoKill;

import com.tsuna.designPatterns.strategy.sanguoKill.strategies.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testStrategies {
    @Test
    public void testRepliesOfAllStrategies(){
        //Privious attack strategy
        IStrategy priviousStrategy;
        //Context when facing with privious strategy
        Context replyContext;
        //Get reply from 'Chai'
        priviousStrategy=new Chai();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'NanMan'
        priviousStrategy=new NanMan();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'Sha'
        priviousStrategy=new Sha();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'ShunQian'
        priviousStrategy=new ShunQian();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'NanMan'
        priviousStrategy=new NanMan();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'Shan'
        priviousStrategy=new Shan();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
        //Get reply from 'WuXie'
        priviousStrategy=new WuXie();
        replyContext=new Context(priviousStrategy);
        Assert.assertEquals(priviousStrategy.effectiveReply(),replyContext.operate());
    }
}
