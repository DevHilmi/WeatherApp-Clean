package com.rizaldev.domain.weather.interactor;

import com.rizaldev.domain.PostExecutionThread;
import com.rizaldev.domain.ThreadExecutor;
import com.rizaldev.domain.weather.repository.WeatherRepository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

/**
 * Created by hilmi.rizaldi (hilmi.rizaldi@dana.id)
 * created on 11/01/19
 */
@RunWith(MockitoJUnitRunner.class)
public class GetCurrentWeatherTest {

    private static final String CITY_NAME = "Jakarta";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private GetCurrentWeather getCurrentWeather;

    @Mock
    private PostExecutionThread mockPostExecutionThread;

    @Mock
    private ThreadExecutor mockThreadExecutor;

    @Mock
    private WeatherRepository mockWeatherRepository;

    @Before
    public void setUp() {
        getCurrentWeather = new GetCurrentWeather(mockThreadExecutor,
            mockPostExecutionThread, mockWeatherRepository);
    }

    @Test
    public void testGetCurrentWeatherUseCasePositiveCase() {
        getCurrentWeather
            .buildUseCaseObservable(GetCurrentWeather.Params.forGetCurrentWeather(CITY_NAME));

        verify(mockWeatherRepository).getCurrentWeather(CITY_NAME);
        verifyNoMoreInteractions(mockWeatherRepository);
        verifyZeroInteractions(mockPostExecutionThread);
        verifyZeroInteractions(mockThreadExecutor);
    }

    @Test
    public void testShouldFailWhenNoOrEmptyParameters() {
        expectedException.expect(NullPointerException.class);
        getCurrentWeather.buildUseCaseObservable(null);
    }

}
