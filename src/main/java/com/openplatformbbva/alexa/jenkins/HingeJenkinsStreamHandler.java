package com.openplatformbbva.alexa.jenkins;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.openplatformbbva.alexa.jenkins.handlers.CancelandStopIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.FallbackIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HelloWorldIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HelpIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeApprovePullRequestIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeGenerateReleaseIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeLoadTermsAndConditionsIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeOfacCleanHitIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeOfacGenerateDevelopersFileIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeOfacMarkHitIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeOpenPullRequestIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeServiceRunTestsIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeServiceStatusIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.HingeServiceVersionIntentHandler;
import com.openplatformbbva.alexa.jenkins.handlers.LaunchRequestHandler;
import com.openplatformbbva.alexa.jenkins.handlers.SessionEndedRequestHandler;

public class HingeJenkinsStreamHandler extends SkillStreamHandler {

  private static final String SKILL_ID = "amzn1.ask.skill.a5557c0c-981b-495d-8bd0-1c2563ad54cf";

  private static Skill getSkill() {
    return Skills.standard()
          .addRequestHandlers(
                new CancelandStopIntentHandler(), 
                new HelloWorldIntentHandler(),
                new HelpIntentHandler(), 
                new LaunchRequestHandler(), 
                new SessionEndedRequestHandler(), 
                new FallbackIntentHandler(),
                new HingeApprovePullRequestIntentHandler(),
                new HingeGenerateReleaseIntentHandler(),
                new HingeLoadTermsAndConditionsIntentHandler(),
                new HingeOfacCleanHitIntentHandler(),
                new HingeOfacGenerateDevelopersFileIntentHandler(),
                new HingeOfacMarkHitIntentHandler(),
                new HingeOpenPullRequestIntentHandler(),
                new HingeServiceRunTestsIntentHandler(),
                new HingeServiceStatusIntentHandler(),
                new HingeServiceVersionIntentHandler()
                )
          .withSkillId(SKILL_ID)
          .build();
  }

  public HingeJenkinsStreamHandler() {
    super(getSkill());
  }

}
