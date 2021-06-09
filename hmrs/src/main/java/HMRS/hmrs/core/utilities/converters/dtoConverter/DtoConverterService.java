package HMRS.hmrs.core.utilities.converters.dtoConverter;

import java.util.List;

public interface DtoConverterService {

	<S, T> List<T> dtoConverter(List<S> s, Class<T> targetClass);
	public <T> Object dtoClassConverter(Object source,Class<T> baseClass);
	
}
