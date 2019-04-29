package com.repose.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author 常清 2019年04月29日 新建
 * @since 0.0.0-SNAPSHOT
 */
public class UserServiceTest {

    @Mock
    private UserDao userDao;
    private UserService userService;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(userDao);
    }

    @Test
    public void testVerify() {
        User user = new User();
        user.setId(1);
        user.setName("ricky");

        when(userDao.queryUserByid(1)).thenReturn(user);
        boolean success = userService.update(1, "Jack");
        Assert.assertEquals(true, success);

        verify(userDao).queryUserByid(1);

        ArgumentCaptor<User> personCaptor = ArgumentCaptor.forClass(User.class);
        verify(userDao).update(personCaptor.capture());
        User updatedUser = personCaptor.getValue();

        Assert.assertEquals("Jack", updatedUser.getName());
    }
}