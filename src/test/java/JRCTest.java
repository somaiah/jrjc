// This software is produced by SpareBank1. Unauthorized redistribution,
// reproduction or usage of this software in whole or in part without the
// express written consent of SpareBank1 is strictly prohibited.
// Copyright © 2011 SpareBank1
// ALL RIGHTS RESERVED

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.atlassian.jira.rest.client.api.domain.Issue;

public class JRCTest
{
    private static final String jiraKey = "MOON-13";
    @Test
    public void testGetIssue() throws Exception {
        Issue issue = new JRC().getIssue(jiraKey);
        assertThat(issue.getKey(), is(jiraKey));
    }
}
