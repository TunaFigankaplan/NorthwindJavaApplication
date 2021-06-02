package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrete.Position;

public interface PositionService {
	Result add(Position position);
	DataResult<List<Position>> getAll();
}