package com.github.stitchgk.composite.composite;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/5
 **/
public class CompositeTest {

    @Test
    public void test() {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4, folder5;
        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张三.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();

        /**
         * Output:
         * 对文件夹：Sunny的资料进行杀毒。
         * 对文件夹：图像文件进行杀毒。
         * ----对图像文件'小龙女.jpg'进行杀毒
         * ----对图像文件'张三.gif'进行杀毒
         * 对文件夹：文本文件进行杀毒。
         * ----对文本文件'九阴真经.txt'进行杀毒
         * ----对文本文件'葵花宝典.doc'进行杀毒
         * 对文件夹：视频文件进行杀毒。
         * ----对视频文件'笑傲江湖.rmvb'进行杀毒
         */
    }

}
