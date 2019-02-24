package hello.topic;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Topic implements Serializable {

    @ApiModelProperty(notes = "description about the topic id", required = true)
    private String id;

    @ApiModelProperty(notes = "description about the topic name")
    private String name;

    @ApiModelProperty(notes = "description about the topic desc")
    private String desc;

    public Topic() {

    }

    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
