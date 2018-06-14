package io.renren.modules.WeiYu.Controller;

import io.renren.common.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;

@RestController
@RequestMapping("/file")
public class FileController {

    @GetMapping("/getImg")
    @ApiOperation("获取图片")
    @ResponseBody
    /*
    * filePath 文件路径
    * */
    public byte[] getImage(HttpServletRequest request, HttpServletResponse response, @RequestParam String filePath) throws IOException {

        FileInputStream fis = null;
        OutputStream os = null;
        byte[] buffer = null;

        try {
            fis = new FileInputStream(new File(Paths.get(filePath).toString()));
            os = response.getOutputStream();
            int count = 0;
            buffer = new byte[1024 * 8];
            while ((count = fis.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return buffer;
    }

    @PostMapping("/uploadImg")
    @ApiOperation("上传图片")
    @ResponseBody
    public R uploadImg(@RequestParam("file") MultipartFile file,
                                          HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        System.out.println("filePath-->" + filePath);
        try {
            uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
        //返回json
        return R.ok("上传成功");
    }

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
