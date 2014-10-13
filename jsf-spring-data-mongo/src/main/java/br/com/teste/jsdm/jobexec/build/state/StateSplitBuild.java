package br.com.teste.jsdm.jobexec.build.state;

import java.util.ArrayList;

import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.State;
import org.springframework.batch.core.job.flow.support.state.SplitState;
import org.springframework.stereotype.Component;

import br.com.teste.jsdm.model.TypeProcessStep;

@Component("stateSplitBuild")
public class StateSplitBuild extends StateBuild {

	@Override
	public State build(TypeProcessStep typeProcessStep) {
		SplitState splitState = new SplitState(new ArrayList<Flow>(), typeProcessStep.getId());
//		splitState.setTaskExecutor(taskExecutor);
		return splitState;
	}

}
