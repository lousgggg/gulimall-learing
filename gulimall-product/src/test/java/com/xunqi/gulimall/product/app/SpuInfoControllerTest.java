package com.xunqi.gulimall.product.app;

import com.xunqi.common.utils.PageUtils;
import com.xunqi.common.utils.R;
import com.xunqi.gulimall.product.entity.SpuInfoEntity;
import com.xunqi.gulimall.product.service.SpuInfoService;
import com.xunqi.gulimall.product.vo.SpuSaveVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashMap;

import static org.mockito.Mockito.*;

public class SpuInfoControllerTest {
    @Mock
    SpuInfoService spuInfoService;
    @InjectMocks
    SpuInfoController spuInfoController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetSpuInfoBySkuId() throws Exception {
        when(spuInfoService.getSpuInfoBySkuId(anyLong())).thenReturn(new SpuInfoEntity());

        R result = spuInfoController.getSpuInfoBySkuId(Long.valueOf(1));
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testSpuUp() throws Exception {
        R result = spuInfoController.spuUp(Long.valueOf(1));
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testList() throws Exception {
        when(spuInfoService.queryPageByCondtion(any())).thenReturn(new PageUtils(Arrays.asList(null), 0, 0, 0));

        R result = spuInfoController.list(new HashMap<String, Object>() {{
            put("String", "params");
        }});
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testInfo() throws Exception {
        R result = spuInfoController.info(Long.valueOf(1));
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testSave() throws Exception {
        R result = spuInfoController.save(new SpuSaveVo());
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testUpdate() throws Exception {
        R result = spuInfoController.update(new SpuInfoEntity());
        Assert.assertEquals(new R(), result);
    }

    @Test
    public void testDelete() throws Exception {
        R result = spuInfoController.delete(new Long[]{Long.valueOf(1)});
        Assert.assertEquals(new R(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme