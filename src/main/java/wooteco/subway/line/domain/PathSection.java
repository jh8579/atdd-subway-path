package wooteco.subway.line.domain;

public class PathSection {
    private final Long id;
    private final Long upStationId;
    private final Long downStationId;
    private final int distance;

    public PathSection(Long id, Long upStationId, Long downStationId, int distance) {
        this.id = id;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
