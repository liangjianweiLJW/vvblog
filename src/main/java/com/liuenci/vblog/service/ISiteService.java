package com.liuenci.vblog.service;

import com.liuenci.vblog.dto.MetaDto;
import com.liuenci.vblog.model.bo.ArchiveBo;
import com.liuenci.vblog.model.bo.BackResponseBo;
import com.liuenci.vblog.model.bo.StatisticsBo;
import com.liuenci.vblog.model.vo.CommentVo;
import com.liuenci.vblog.model.vo.ContentVo;

import java.util.List;

/**
 * 站点服务
 * @author liuenci
 */
public interface ISiteService {


    /**
     * 最新收到的评论
     *
     * @param limit
     * @return
     */
    List<CommentVo> recentComments(int limit);

    /**
     * 最新发表的文章
     *
     * @param limit
     * @return
     */
    List<ContentVo> recentContents(int limit);

    /**
     * 查询一条评论
     * @param coid
     * @return
     */
    CommentVo getComment(Integer coid);

    /**
     * 系统备份
     * @param bkType
     * @param bkPath
     * @param fmt
     * @return
     */
    BackResponseBo backup(String bkType, String bkPath, String fmt) throws Exception;


    /**
     * 获取后台统计数据
     *
     * @return
     */
    StatisticsBo getStatistics();

    /**
     * 查询文章归档
     *
     * @return
     */
    List<ArchiveBo> getArchives();

    /**
     * 获取分类/标签列表
     * @return
     */
    List<MetaDto> metas(String type, String orderBy, int limit);

}
